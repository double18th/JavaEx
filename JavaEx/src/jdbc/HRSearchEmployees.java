package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSearchEmployees {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "motion";
		Scanner sc = new Scanner(System.in);
		//객체
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection
									(dburl, dbuser, dbpass);
			System.out.print("이름을 입력하세요:");
			String keyword = sc.next();
			
			// 쿼리 만들기
			String sql = "SELECT first_name, last_name, email, " + 
					"phone_number, to_char(hire_date, 'yy/mm/dd') " + 
					"FROM employees " +
					"WHERE lower(first_name) LIKE '%" + keyword + 
					"%' OR lower(last_name) LIKE '%" + keyword +
					"%'";
			System.out.println("QUERY:" + sql);
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("[검색결과]");
			
			while(rs.next()) {
				System.out.printf("%s %s: %s, %s, %s%n",
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5));
			}			
		} catch (ClassNotFoundException e){
			System.err.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			System.err.println("SQL Error!");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				
			}
		}
		sc.close();
	}
	
}

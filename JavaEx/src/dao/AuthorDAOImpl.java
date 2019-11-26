package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAOImpl implements AuthorDAO {
	String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
	String dbuser = "bituser";
	String dbpass = "bituser";
	// 매번 필요한 게 아니므로 상수로 빼줌 
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			//데이터베이스 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		}
		// catch로 SQLException 처리했을 경우 오류 발생했을 때 null되므로
		// 오류를 바깥에서 처리할 수 있도록 해야함 (throws)
		return conn;
	}
	@Override
	public List<AuthorVO> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<AuthorVO> list = new ArrayList<AuthorVO>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT author_id, author_name, author_desc " +
			"FROM author";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Long authorId = rs.getLong(1);
				String authorName = rs.getString("author_name");
				String authorDesc = rs.getString(3);
				
				AuthorVO vo = new AuthorVO(authorId, authorName, authorDesc);
				// setter로 해도 됨 
				list.add(vo);
			}
		} catch (SQLException e) {
			System.err.println("SQL Error!");
		// SQL Data Logic
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {				
			}
		}
				
		return list;			
	}
		@Override
		public AuthorVO get(Long id) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			AuthorVO author = null;
			ResultSet rs = null;
			
			try {
				conn = getConnection();
				String sql = "SELECT author_id, author_name, author_desc " + 
				"FROM author WHERE author_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1,id);
				rs = pstmt.executeQuery();
				
				if (rs.next()) {
					// 레코드가 있다
					author = new AuthorVO(rs.getLong(1),
										rs.getString(2),
										rs.getString(3));
				} 
				
			} catch (SQLException e) {
				System.err.println("SQL ERROR!");
			} finally {
				try {
					rs.close();
					pstmt.close();
					conn.close();
				} catch (Exception e) {
					
				}
			}
			return author;
		}
		@Override
		public boolean insert(AuthorVO authorVO) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			// 영향을 받은 레코드 개수를 돌려받아야하므로 integer 설정
			int insertedCount = 0;
			
			try {
				conn = getConnection();
				//pstmt에 설정할 SQL 템플릿
				String sql = "INSERT INTO author " +
				"Values(seq_author_pk.NEXTVAL, ?, ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, authorVO.getAuthorName());
				pstmt.setString(2, authorVO.getAuthorDesc());
				
				// INSERT, UPDATE, DELETE는 executeUpdate -> 영향을 받은 레코드의 개수 반환
				insertedCount = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					pstmt.close();
					conn.close();
				} catch (Exception e) {					
				}
			}
			return 1 == insertedCount; // boolean type이므로 수정
		}
		@Override
		public boolean update(AuthorVO authorVO) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			int updatedCount = 0;
			
			try {
				conn = getConnection();
				String sql = "UPDATE author SET " +
				"author_name=?, author_desc=? " + "WHERE author_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, authorVO.getAuthorName());
				pstmt.setString(2, authorVO.getAuthorDesc());
				pstmt.setLong(3, authorVO.getAuthorId());
				
				updatedCount = pstmt.executeUpdate();				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					pstmt.close();
					conn.close();
				} catch (Exception e) {					
				}
			}
			return 1 == updatedCount;
		}
		@Override
		public boolean delete(Long id) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			int deletedCount = 0;
			
			try {
				conn = getConnection();
				String sql = "DELETE FROM author WHERE author_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				
				deletedCount = pstmt.executeUpdate();				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					conn.close();
					pstmt.close();
				} catch (Exception e) {
				} 
			}
			return deletedCount != 0;
		}

}

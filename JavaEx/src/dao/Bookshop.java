package dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bookshop {
	public static void printAuthors() {
		System.out.println("[저자 목록]");
		AuthorDAO dao = new AuthorDAOImpl();	// 인터페이스이므로
		List<AuthorVO> authors = dao.getList();
		
		Iterator<AuthorVO> iter = authors.iterator();
		while(iter.hasNext()) {
			AuthorVO author = iter.next();
			System.out.println(author);
		}
		System.out.println(authors.size() + "명의 저자가 있습니다.");
	}
	
	public static void showAuthor(Long id) {
		// PK가 1인 작가를 출력
		AuthorDAO dao = new AuthorDAOImpl();
		AuthorVO author = dao.get(id);	// LONG 이므로 L 필수
		// null이 넘어올 때 출력하면 안됨 -> 확인 필요 
		if (author != null) {
			System.out.println("Author:" + author);			
		} else {
			System.out.println("저자를 찾지 못함");
		}
	}
	public static void insertAuthor() {
		// Scanner에서 이름과 설명을 입력, author 테이블에 INSERT
		Scanner sc = new Scanner(System.in);
		System.out.print("저자 이름:");
		String name = sc.nextLine();
		System.out.print("설명:");
		String desc = sc.nextLine();
		
		// DAO의 insert 메소드에 전달할 AuthorVO 생성
		AuthorVO author = new AuthorVO(null, name, desc);
		
		AuthorDAO dao = new AuthorDAOImpl();
		// 성공 여부를 알려주는 결과값을 받기
		boolean isSuccess = dao.insert(author);
		
		System.out.println("입력 성공?:" + isSuccess);
		
		printAuthors();
		sc.close();
	}
	
	public static void deleteAuthor() {
		printAuthors();
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 저자의 id:");
		int id = sc.nextInt();
		
		AuthorDAO dao = new AuthorDAOImpl();				
		boolean isSuccess = dao.delete(Long.valueOf(id));	
		// Long 값을 받기 때문에 그냥 id라고 적으면 오류 발생  
		
		System.out.println("삭제 성공?:" + isSuccess);
		
		printAuthors();
		sc.close();	
	}
	
	public static void updateAuthor() {
		printAuthors();
		System.out.print("수정할 저자?:");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		System.out.print("이름:");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("설명:");
		String desc = sc.next();
		
		AuthorVO author = new AuthorVO(Long.valueOf(id), name, desc);
		AuthorDAO dao = new AuthorDAOImpl();
		boolean isSuccess = dao.update(author);
		
		System.out.println("수정 성공?:" + isSuccess);
		
		printAuthors();
		sc.close();
		
	}
	
	public static void main(String[] args) {
		//printAuthors();
		//showAuthor(1L);
		//insertAuthor();
		//deleteAuthor();
		updateAuthor();
	}

}

package dao;

import java.util.List;

public interface AuthorDAO {
	// author 테이블로부터 전체 레코드를 불러오는 메소드
	public List<AuthorVO> getList();
	public AuthorVO get(Long id); // PK 이용, 레코드 불러오기
	public boolean insert(AuthorVO authorVO);
	public boolean update(AuthorVO authorVO);
	public boolean delete(Long id);	// PK 이용 레코드 삭제
}

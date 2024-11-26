package project1;

import java.util.List;

import com.javaex.jdbc.dao.AuthorVo;

public class BookRentalDao {

	
	public List<BookVo> getList();	// 전체 책 목록
	public List<BookVo> search(String keyword);	// 검색
	public BookVo get(Long id);
	public boolean insert(BookVo vo);
	public boolean update(BookVo vo);
	public boolean delete(Long id);
	
}

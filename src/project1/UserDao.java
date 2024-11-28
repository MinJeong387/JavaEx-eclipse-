package project1;

import java.util.List;

public interface UserDao {
	
	public List<UserVo> getList();									// 전체 책 목록
	public List<UserVo> search(String name_id, String password);	// 회원 검색
	public List<UserVo> search2(String author_name);				// 작가 검색
	public List<UserVo> search3(String title);						// 제목 검색
	public List<UserVo> search4(String publisher);					// 출판사 검색
	public List<UserVo> search5(String type);						// 장르 검색
	
	public UserVo get(Long id);
	public boolean insert(UserVo vo);
	public boolean update(UserVo vo);
	public boolean delete(Long id);
	
	
	
	
	public List<UserVo> getListC();
	

}

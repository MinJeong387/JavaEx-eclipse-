package com.javaex.jdbc.dao;

import java.util.List;

public interface AuthorDao {
	public List<AuthorVo> getList();	// 전체 Author의 List를 반환
	public List<AuthorVo> search(String keyword);	// 검색
	public AuthorVo get(Long id);
	public boolean insert(AuthorVo vo);
	public boolean update(AuthorVo vo);
	public boolean delete(Long id);
}

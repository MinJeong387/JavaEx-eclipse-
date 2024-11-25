package com.javaex.jdbc.dao;

// DTO(VO)
// : 자바 계층간 데이터를 주고 받기 위한 데이터 객체
// 	 - 로직이 없는 순수 데이터 객체
//	 - 기본 생성자가 반드시 있어야 한다.
//	 - toString(), equals() 메서드는 만들기도 한다.
public class AuthorVo {
	private Long authorId;
	private String authorName;
	private String authorDesc;

}

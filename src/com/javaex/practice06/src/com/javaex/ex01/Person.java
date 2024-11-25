package com.javaex.practice06.src.com.javaex.ex01;

public class Person {
	protected String name;
	protected String hp;

	
	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;

	}

	// getter, setter

	public void showInfo() {

		System.out.println("#이름:" + name + ", #핸드폰:" + hp);
	}

}

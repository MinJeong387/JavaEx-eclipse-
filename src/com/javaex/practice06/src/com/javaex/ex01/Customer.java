package com.javaex.practice06.src.com.javaex.ex01;

public class Customer extends Person {
	protected int cNo;
	protected int point;

	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}


	@Override
	public void showInfo() {

		System.out.println("#이름:" + name + ", #핸드폰:" + hp + ", #고객번호:" + cNo + ", #포인트점수:" + point);
	} 
}


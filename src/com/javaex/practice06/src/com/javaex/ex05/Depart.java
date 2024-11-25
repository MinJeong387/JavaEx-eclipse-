package com.javaex.practice06.src.com.javaex.ex05;

public class Depart extends Employee {

	String department;

	// 코드작성
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	@Override
	public void showInformation() {
		System.out.println("이름:" + super.getName() + " 연봉:" + super.getSalary() + " 부서:" + department);
	}

}

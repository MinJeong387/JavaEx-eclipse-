package com.javaex.practice06.src.com.javaex.ex04;

public class Employee extends User {
	protected int salary;

	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;

	}

	public int getSalary() {
		return salary;
	}

	@Override
	public void showInfo() {

		System.out.println("#아이디:" + id + ", #패스워드:" + password + ", #이름:" + name + ", #월급:" + salary);

	}

}

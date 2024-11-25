package com.javaex.practice06.src.com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {

		User[] user = { new Customer("jws", "j1234", "정우성", 1000), 
				new Customer("yjs", "y2345", "이효리", 2000),
				new Employee("master", "m7788", "운영자", 5000000) };

		for (int i = 0; i < user.length; i++) {
			user[i].showInfo();

		}

		System.out.printf("운영자의 월급은 %d원 입니다.", ((Employee) user[2]).getSalary());

	}
}

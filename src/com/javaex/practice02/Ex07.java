package com.javaex.practice02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		ex07();

	}

	private static void ex07() {
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");

		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		if (0 <= age && age <= 7) {
			System.out.print("취학전아동/무료 입니다.");
		} else if (8 <= age && age <= 13) {
			System.out.print("초등학생/2000원 입니다.");
		} else if (14 <= age && age <= 16) {
			System.out.print("중학생/3000원 입니다.");
		} else if (17 <= age && age <= 19) {
			System.out.print("고등학생/4000원 입니다.");
		} else if (20 <= age) {
			System.out.print("성인/5000원 입니다.");
		}

		scanner.close();

	}

}

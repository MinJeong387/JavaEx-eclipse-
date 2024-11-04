package com.javaex.practice02;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		ex23();

	}

	private static void ex23() {

		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		int thisyear = 2024;

		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();

		System.out.println("올해:" + thisyear);
		System.out.println("태어난해:" + year);

		int age = (thisyear - year);
		System.out.println("나이:" + age);
		System.out.println("=======================");

		if (age < 20) {
			System.out.println("20살미만 건강검진대상이 아님");
		} else {
			if ((thisyear - year) % 2 == 0 && age < 40) {
				System.out.println("20살이상");
				System.out.println("건강검진해");
				System.out.println("암 검사X");
			} else if ((thisyear - year) % 2 == 0 && 40 <= age) {
				System.out.println("20살이상");
				System.out.println("건강검진해");
				System.out.println("암 검사");

			} else {
				System.out.println("20살이상");
				System.out.println("건강검진해 아님");
			}

		}

		scanner.close();

	}

}

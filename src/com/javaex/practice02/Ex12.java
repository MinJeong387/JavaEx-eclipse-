package com.javaex.practice02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		ex12();
	}

	private static void ex12() {
		System.out.println("숫자 3개를 입력해주세요");
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자1: ");
		double num1 = scanner.nextDouble();

		System.out.print("숫자2: ");
		double num2 = scanner.nextDouble();

		System.out.print("숫자3: ");
		double num3 = scanner.nextDouble();

		if (num1 < num2 && num1 < num3) {
			System.out.println("가장 작은수는" + num1 + "입니다");
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("가장 작은수는" + num2 + "입니다");
		} else if (num3 < num2 && num3 < num1) {
			System.out.println("가장 작은수는" + num3 + "입니다");
		} else {
			System.out.println("세 숫자는 모두 달라야 합니다.");
		}

		scanner.close();

	}

}

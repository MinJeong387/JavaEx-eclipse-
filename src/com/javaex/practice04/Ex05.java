package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		ex05();

	}

	private static void ex05() {

		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		double num3 = scanner.nextDouble();
		double num4 = scanner.nextDouble();
		double num5 = scanner.nextDouble();

		double ave = (num1 + num2 + num3 + num4 + num5) / 5;

		System.out.print("평균은 " + ave + "입니다.");
	}

}

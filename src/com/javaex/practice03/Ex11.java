package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		ex11();

	}

	private static void ex11() {

		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int sum = 0;

		if (num % 2 == 0) {

			for (int i = 1; i <= (num / 2); ++i) {

				sum = sum + i;

			}

			sum = sum * 2;

		} else {
			sum = ((num + 1) / 2);
			sum = sum * sum;

		}

		System.out.println("결과값: " + sum);

		scanner.close();
	}

}

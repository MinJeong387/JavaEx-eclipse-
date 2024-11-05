package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		ex07();

	}

	private static void ex07() {

		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);

		int i = scanner.nextInt();
		int j;
		int k;

		for (j = 1; j <= i; ++j) {
			for (k = 1; k <= j; ++k) {

				System.out.print(j);

			}

			System.out.println();

		}
		
		scanner.close();

	}

}

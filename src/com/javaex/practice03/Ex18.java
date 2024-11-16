package com.javaex.practice03;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		for (int i = num; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int k = 2; k <= num; k++) {
			for (int l = 1; l <= k; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}

package com.javaex.practice03;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= num; j++) {
				if (i * j == num) {
					System.out.println(i);

				}
			}

		}

		sc.close();

	}

}

package com.javaex.practice03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i;

		for (i = num; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		sc.close();
	}

}

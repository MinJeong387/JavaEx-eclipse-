package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = 0;
		int sum = 0;

		while (j != 4) {
			System.out.println("----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------");

			System.out.print("선택>");
			int i = sc.nextInt();
			j = i;

			if (j == 1) {
				System.out.print("예금액>");
				int k = sc.nextInt();
				sum += k;
			}

			else if (j == 2) {
				System.out.print("출금액>");
				int l = sc.nextInt();
				sum -= l;
			}

			else if (j == 3) {
				System.out.print("잔고액>");
				System.out.println(sum);
			}

			else if (j == 4) {
				System.out.print("프로그램 종료");
			}

			else {
				System.out.println("다시입력해주세요");
			}
		}

		sc.close();

	}

}
package com.javaex.practice03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String dap = "";
		int i = 0;
		int num = 0;

		do {
			System.out.println("=================");
			System.out.println("  숫자맞추기게임 시작  ");
			System.out.println("=================");
			num = (int) (Math.random() * 100) + 1;

			System.out.println(num);
			System.out.print(">>");
			i = sc.nextInt();

			while (i != num) {
				if (i > num) {
					System.out.println("더 낮게");
					System.out.print(">>");
					i = sc.nextInt();
				}

				else if (i < num) {
					System.out.println("더 높게");
					System.out.print(">>");
					i = sc.nextInt();
				}
			}

			System.out.println("맞았습니다.");
			System.out.print("게임을 종료하시겠습니까?(y/n) >>");
			dap = sc.next();
		}

		while (!dap.equals("y"));

		System.out.println("=================");
		System.out.println("  숫자맞추기게임 종료  ");
		System.out.println("=================");
		sc.close();
	}
}

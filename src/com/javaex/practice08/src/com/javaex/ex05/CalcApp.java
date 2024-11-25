package com.javaex.practice08.src.com.javaex.ex05;

import java.util.Scanner;

// Command 패턴과 유사한
public class CalcApp {

	public static void main(String[] args) {
		// 스캐너에서 한 줄 입력
		// 공백 구분자로 분할
		// 첫번째 토큰 -> 숫자1
		// 두번째 토큰 -> 연산자기호
		// 세번째 토큰 -> 숫자2
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 한 줄 입력
			System.out.print(">> ");
			String line = sc.nextLine();

			if (line.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}

			String tokens[] = line.split(" ");
			int leftNum = Integer.valueOf(tokens[0]);
			String operator = tokens[1];
			int rightNum = Integer.valueOf(tokens[2]);

			switch (operator) {

			case "+":
				Add add = new Add();
				add.setValue(leftNum, rightNum);
				System.out.println(">> " + add.calculate());
				break;

			case "-":
				Sub sub = new Sub();
				sub.setValue(leftNum, rightNum);
				System.out.println(">> " + sub.calculate());
				break;

			case "*":
				Mul mul = new Mul();
				mul.setValue(leftNum, rightNum);
				System.out.println(">> " + mul.calculate());
				break;

			case "/":
				Div div = new Div();
				div.setValue(leftNum, rightNum);
				System.out.println(">> " + div.calculate());
				break;

			default:
				System.out.println("알 수 없는 연산입니다.");
				break;
			}
		}
		sc.close();
	}
}

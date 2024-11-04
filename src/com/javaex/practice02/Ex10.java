package com.javaex.practice02;

import java.util.Scanner;

public class Ex10 {
	
	

	public static void main(String[] args) {
		ex10();
		
	}

	private static void ex10() {
		System.out.println("숫자2개를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자1: ");
		double num1 = scanner.nextDouble();
		System.out.print("숫자2: ");
		double num2 = scanner.nextDouble();
		
		
		if (num1>num2) {
			System.out.print("큰수: "+num1+"작은수: "+num2);
		}
		else if (num1<num2) {
			System.out.print("큰수: "+num2+ " 작은수: "+num1);
		}
		else {
			System.out.print("두 수는 같습니다.");
		}
		scanner.close();
		

	}
}

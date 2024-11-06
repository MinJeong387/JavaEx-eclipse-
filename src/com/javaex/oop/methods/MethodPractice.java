package com.javaex.oop.methods;

import java.util.Scanner;

public class MethodPractice {

	public static void main(String[] args) {

		printHelloMethod(); // 문제1
		printNumbers(); // 문제2

		// 문제3
		int randomNum = getRandomNumber();
		System.out.println("0~100사이의 랜덤한 정수는: " + randomNum);

		// 문제4
		int getTotal = getSum();
		System.out.println("1~10까지의 합은: " + getTotal);

		// 문제5
		System.out.print("정수를 하나 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num2 = scanner.nextInt();
		
		printOddOrEven(num2);

	}

	// 문제1

	private static void printHelloMethod() {
		System.out.println("Hello Method!");
	}

	// 문제2
	private static void printNumbers() {

		int i;
		for (i = 1; i <= 10; ++i) {
			System.out.print(i + " ");
		}

		System.out.println();

	}

// 문제3
	private static int getRandomNumber() {

		int num = (int) (Math.random() * 101);
		return num;

	}

// 문제4
	private static int getSum() {
		int sum = 0;

		for (int i = 1; i <= 10; ++i) {
			sum = sum + i;
		}

		return sum;

	}

// 문제5
	private static void printOddOrEven(int num3) {

		

		if (num3 % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}


	}

}

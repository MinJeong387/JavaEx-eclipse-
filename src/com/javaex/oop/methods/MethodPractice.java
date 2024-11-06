package com.javaex.oop.methods;

import java.util.Scanner;

public class MethodPractice {

	public static void main(String[] args) {

		// 문제1
		printHelloMethod();
		// 문제2
		printNumbers();

		// 문제3
		int randomNum = getRandomNumber();
		System.out.println("0~100사이의 랜덤한 정수는: " + randomNum);

		// 문제4
		int getTotal = getSum();
		System.out.println("1~10까지의 합은: " + getTotal);

		// 문제5
		System.out.print("정수를 하나 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int num2 = scanner.nextInt();
		printOddOrEven(num2);

		// 문제6
		System.out.print("문자열을 입력하세요: ");
		String word = scanner.next();
		printStringLength(word);

		// 문제7
		System.out.println("서로 다른 두 정수를 입력하세요");
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		System.out.println("둘 중 더 큰수는 ? " + getLargeNumber(num4, num5));

		// 문제8
		System.out.println("문자열 두 개를 입력하세요");
		String word3 = scanner.next();
		String word4 = scanner.next();
		System.out.println(concatenateStrings(word3, word4));

		// 문제9
		int sum1 = sumAll(1, 2, 3, 4, 5);
		System.out.println("합산된 결과 정수 : " + sum1);

		// 문제10
		String sentence = concatenateWords("안녕", "하십니까", "형님");
		System.out.println(sentence);

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

	// 문제6
	private static void printStringLength(String word2) {

		System.out.println("문자열의 길이는 ? " + word2.length());

	};

	// 문제7
	private static int getLargeNumber(int num6, int num7) {
		if (num6 > num7) {
			return num6;
		} else {
			return num7;
		}

	}

	// 문제8
	private static String concatenateStrings(String word5, String word6) {
		return word5 + word6;
	}

	// 문제9
	private static int sumAll(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}

		return sum;
	}

	// 문제10
	private static String concatenateWords(String... words) {

		for (String word : words) {
			System.out.print(word);
		}

		return "";

	}
}

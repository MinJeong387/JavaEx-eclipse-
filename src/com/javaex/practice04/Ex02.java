package com.javaex.practice04;

public class Ex02 {

	public static void main(String[] args) {
		ex02();

	}

	private static void ex02() {

		double doubleArray[] = { 1.2, 3.3, 6.7 };
		int i;

		for (i = 0; i < doubleArray.length; ++i) {
			System.out.println(doubleArray[doubleArray.length - 1 - i]);
		}

	}

}

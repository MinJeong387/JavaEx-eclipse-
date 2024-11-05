package com.javaex.practice04;

public class Ex04 {

	public static void main(String[] args) {

		ex04();

	}

	private static void ex04() {

		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };

		int i;
		int count = 0;
		int sum = 0;

		for (i = 1; i < data.length; i++) {
			if (data[i] % 3 == 0) {
				count += 1;
				sum = sum + data[i];
			}

		}

		System.out.println("주어진 배열에서 3의 배수의 개수=>" + count);
		System.out.println("주어진 배열에서 3의 배수의 합=>" + sum);

	}

}

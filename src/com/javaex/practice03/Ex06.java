package com.javaex.practice03;

public class Ex06 {

	public static void main(String[] args) {
		ex06();

	}

	private static void ex06() {

		int x = 1;

		while (x <= 100) {

			if (x % 5 == 0 && x % 7 == 0) {
				System.out.println(x);
			}

			x += 1;

		}

	}

}

package com.javaex.practice04;

public class Ex08 {

	public static void main(String[] args) {
		ex08();

	}

	private static void ex08() {

		int i = 0;
		while (i < 6) {
			int num = (int) (Math.random() * 45) + 1;

			System.out.print(num + " ");

			i += 1;
		}
	}

}

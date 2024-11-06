package com.javaex.practice03;

public class Ex08 {

	public static void main(String[] args) {
		ex08();

	}

	private static void ex08() {

		int i;
		int j;

		for (i = 1; i < 10; ++i) {
			for (j = 2; j < 10; ++j) {

				System.out.print(j + "*" + i + "=" + i * j + "\t");

			}
			System.out.println();
		}

	}

}

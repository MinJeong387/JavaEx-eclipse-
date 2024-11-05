package com.javaex.practice04;

public class Ex06 {

	public static void main(String[] args) {
		ex06();

	}

	private static void ex06() {

		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };

		int i;

		for (i = 0; i < c.length; ++i) {
			System.out.print(c[i]);
		}

		System.out.println();

		for (i = 0; i < c.length; ++i) {
			if (c[i] == ' ') {
				System.out.print(",");
			} else {
				System.out.print(c[i]);
			}
		}
	}

}

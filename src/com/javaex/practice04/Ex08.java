package com.javaex.practice04;

import java.util.Arrays;

public class Ex08 {

	public static void main(String[] args) {
		ex08();
	}

	private static void ex08() {

		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			System.out.print(num[i] + "  ");
		}

	}
}

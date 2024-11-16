package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		ex05();
	}

	private static void ex05() {
		Scanner sc = new Scanner(System.in);

		Double nums[] = new Double[5];
		double sum = 0;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextDouble();
			sum += nums[i];
		}

		double avg = sum / 5;

		System.out.print("평균은 " + avg + "입니다.");

		sc.close();
	}

}
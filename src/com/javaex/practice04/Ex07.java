package com.javaex.practice04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		ex07();

	}

	private static void ex07() {

		int wonArray[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.print("금액: ");
		Scanner scanner = new Scanner(System.in);
		int cost = scanner.nextInt();

		/*
		 * int num0 = cost/wonArray[0]; 
		 * 
		 * int num1 = (cost%wonArray[0])/wonArray[1]; 
		 * int num2 = (cost%wonArray[0]%wonArray[1])/wonArray[2]; 
		 * int num3 = (cost%wonArray[0]%wonArray[1]%wonArray[2])/wonArray[3];  ....
		 */

		int numArray[] = new int[10];
		numArray[0] = cost / wonArray[0];

		for (int i = 1; i <= wonArray.length - 1; i++) {
			for (int j = 0; j <= (i - 1); j++) {

				cost = cost % wonArray[j];

			}

			numArray[i] = cost / wonArray[i];
		}

		System.out.println("50000원: " + numArray[0] + "개");
		System.out.println("10000원: " + numArray[1] + "개");
		System.out.println("5000원: " + numArray[2] + "개");
		System.out.println("1000원: " + numArray[3] + "개");
		System.out.println("500원: " + numArray[4] + "개");
		System.out.println("100원: " + numArray[5] + "개");
		System.out.println("50원: " + numArray[6] + "개");
		System.out.println("10원: " + numArray[7] + "개");
		System.out.println("5원: " + numArray[8] + "개");
		System.out.println("1원: " + numArray[9] + "개");
		
		scanner.close();

	}

}

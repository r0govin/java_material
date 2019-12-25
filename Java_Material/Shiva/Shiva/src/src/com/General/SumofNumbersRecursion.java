package com.General;

import java.util.Scanner;

public class SumofNumbersRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("The sum of number is:" + sum(n));

		/*
		 * int sum = 0; while (n > 0) { int r = n % 10; sum = sum + r; n = n /
		 * 10; } System.out.println(sum);
		 */

	}

	private static int sum(int n) {
		int r, sum = 0;
		if (n == 0)
			return 0;
		else

			r = n % 10;
		sum = sum + r + sum(n / 10);
		return sum;
	}

}

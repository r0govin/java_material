package com.General;

import java.util.Scanner;

public class FibonacciRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		for (int i = 2; i < n; i++) {
			System.out.println(fibonacci(n));
		}

	}

	private static int fibonacci(int n) {

		if (n == 0 || n == 1)
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

}

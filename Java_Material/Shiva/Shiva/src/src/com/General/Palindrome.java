package com.General;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		int rev = 0;
		while (n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println(rev);

		if (rev == n) {
			System.out.println("the given number is palindrome");
		} else {
			System.out.println("The given number is not palindrome");
		}

	}

}

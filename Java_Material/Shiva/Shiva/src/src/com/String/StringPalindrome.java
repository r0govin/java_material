package com.String;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String\n");
		String s = sc.nextLine();
		// 1. Using String Reverse Method
		System.out.println("1. Using String Reverse Method ");
		if (StringPalinDrome1(s)) {
			System.out.println("The given String is palindrome");
		} else
			System.out.println("The Given String is not a palindrome");

		// 2. Using the Divide and concurred method
		System.out.println("2. Using the Divide and concurred method");
		if (StringPalinDrome2(s)) {
			System.out.println("The given String is palindrome");
		} else
			System.out.println("The Given String is not a palindrome");

	}

	private static boolean StringPalinDrome1(String s) {

		StringBuffer sb = new StringBuffer(s);
		String s2 = sb.reverse().toString();
		if (s2.equals(s)) {
			return true;

		}
		return false;
	}

	private static boolean StringPalinDrome2(String s) {

		for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
			if (s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;
	}

}

package com.String;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Object obj = new Object();
		System.out.println("Enter the String");
		String s = sc.nextLine();
		// 1. Using toCharArray() Method
		System.out.println("Using toCharArray() String length is  "
				+ StringLength1(s));
		// 2. Using the StringIndexOutOfBoundsException Method
		System.out.println("Using StringIndexOutOfBoundsException String length is  "
				+ StringLength2(s));
	}

	private static int StringLength1(String s) {
		char[] ch = s.toCharArray();
		int i = 0;
		for (char ch1 : ch) {
			i++;
		}

		return i;
	}

	private static int StringLength2(String s) {
		int i = 0;
		try {
			for (i = 0;; i++) {
				s.charAt(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

}

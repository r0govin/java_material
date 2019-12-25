package com.String;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String\n");
		String s = sc.nextLine();
		System.out.println("1. Using String Buffer class " + StringReverse1(s));
		System.out.println("2. Using the For Loop and String "
				+ StrinReverse2(s));
		System.out.println("3. Using the For Loop and String Builder "
				+ StrinReverse3(s));
	}

	private static String StringReverse1(String s) {
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}

	private static String StrinReverse2(String s) {
		// String s2="";
		StringBuilder sb = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			// s2=s2+s.charAt(i);

			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	private static String StrinReverse3(String s) {
		String s2 = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			s2 = s2 + s.charAt(i);

		}
		return s2;
	}

}

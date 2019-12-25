package com.String;

import java.util.Scanner;

public class LongestSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		char[] charArray = s.toCharArray();
		char ch1 = 0;
		int longest = 1;
		int longer = 1;

		for (int i = 1; i < s.length(); i++) {
			if (charArray[i - 1] == charArray[i]) {
				longer++;

			} else
				longer = 1;
			if (longer > longest) {
				ch1 = charArray[i];
				longest = longer;
			}
		}
		
		for(int j=1;j<=longest;j++)
		{
			System.out.println(ch1+"-------"+j);
		}

	}
}

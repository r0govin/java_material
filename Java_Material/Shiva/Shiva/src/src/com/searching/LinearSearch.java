package com.searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] inputArray = { 5, 8, 4, 6, 9, 2, 7 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number u want to search");
		int n = sc.nextInt();
		System.out.println("element" + n + " found at the position"
				+ linearSearch(inputArray, n));
		/*
		 * for (int i = 0; i < inputArray.length; i++) { if (n == inputArray[i])
		 * {
		 * 
		 * break; }
		 * 
		 * }
		 */

	}

	private static int linearSearch(int[] inputArray, int n) {

		for (int i = 0; i < inputArray.length; i++) {
			if (n == inputArray[i]) {

				return i;

			}

		}
		return -1;

	}
}

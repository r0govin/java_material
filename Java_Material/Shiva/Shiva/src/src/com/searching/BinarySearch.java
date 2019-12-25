package com.searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int[] inputArray = { 5, 8, 4, 6, 9, 2, 7 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number u want to search");
		int key = sc.nextInt();
		System.out.println(key + "is founded at the position"
				+ binarysearch(inputArray, key));

	}

	private static int binarysearch(int[] inputArray, int key) {

		int low = 0;
		int high = inputArray.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (key < inputArray[mid]) {
				high = mid - 1;
			} else if (key > inputArray[mid]) {
				low = mid + 1;
			} else
				return mid;
		
		}

		return -1;
	}

}

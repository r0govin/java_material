package com.Array;

public class FindMissingDupArray {

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 2, 2, 3, 4, 6, 8, 9, 10 };
		System.out.println(findMissingNum(intArray));

	}

	public static int findMissingNum(int[] intArray) {

		if (null != intArray) {
			for (int i = 0; i < intArray.length - 1; i++) {
				int n = intArray[i] + 1;
				if (intArray[i] == intArray[i + 1]) {
					continue;
				}
				if (n == intArray[i + 1]) {
					continue;
				} else
					return n;
			}
		}
		return 0;
	}

}

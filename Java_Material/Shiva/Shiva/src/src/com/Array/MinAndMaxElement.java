package com.Array;

public class MinAndMaxElement {

	public static void main(String[] args) {

		int[] inputArray = { -2, 0, 2, 4, 5, 8, 2, 1, 6, 9, 35 };
		int min = inputArray[0];
		int max = inputArray[0];
		for (int i = 0; i < inputArray.length; i++) {
			if (min > inputArray[i]) {
				min = inputArray[i];
			}
			if (max < inputArray[i]) {
				max = inputArray[i];
			}
		}
		System.out.println("minimum element in given array is:" + min);
		System.out.println("maximum element in given array is:" + max);

	}

}

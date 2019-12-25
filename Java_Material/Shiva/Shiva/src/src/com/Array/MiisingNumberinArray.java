package com.Array;

public class MiisingNumberinArray {
	static int index = -1;

	public static void main(String[] args) {

		int[] inputArray = { 1, 2, 3, 4, 6, 7, 8 };

		System.out
				.println("if zero is not included then missing number in array is"
						+ findNumber1(inputArray));

		int[] inputArray1 = { 1, 2, 0, 3, 4, 6, 7, 8 };
		System.out
				.println("if zero is  included then missing number in array is"
						+ findNumber2(inputArray1));

	}

	private static int findNumber1(int[] inputArray) {
		int length = inputArray.length;
		// System.out.println(length);
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum = sum + inputArray[i];
		}
		// System.out.println(sum);
		int sumofnumbers = ((length + 1) * (length + 2)) / 2;
		// System.out.println(sumofnumbers);
		return (sumofnumbers - sum);
	}

	private static int findNumber2(int[] inputArray) {
		int length = inputArray.length;
		// System.out.println(length);
		int sum = 0;
		for (int i = 0; i < length; i++) {
			if (inputArray[i] == 0)
				index = i;
			else
				sum = sum + inputArray[i];
		}
		// System.out.println(sum);
		int sumofnumbers = (length * (length + 1)) / 2;
		// System.out.println(sumofnumbers);
		return (sumofnumbers - sum);
	}

}

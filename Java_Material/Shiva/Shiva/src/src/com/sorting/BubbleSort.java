package com.sorting;

public class BubbleSort {

	public static void main(String a[]) {
		// Numbers which need to be sorted
		int inputArray[] = { 23, 5, 23, 1, 7, 12, 3, 34, 0 };

		// Displaying the numbers before sorting
		System.out.print("Before sorting, numbers are ");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
		System.out.println();

		// Sorting in descending order using bubble sort
		bubblesort(inputArray);

		// Displaying the numbers after sorting
		System.out.print("Before sorting, numbers are ");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}

	}

	// This method sorts the input array in desecnding order
	public static void bubblesort(int numbers[]) {
		int temp;
		final int y=10;
		System.out.println(y);
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 1; j < (numbers.length - i); j++) {
				// if numbers[j-1] < numbers[j], swap the elements
				if (numbers[j - 1] > numbers[j]) {
					temp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}

}

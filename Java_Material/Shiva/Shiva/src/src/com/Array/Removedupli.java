package com.Array;

public class Removedupli {

	public static void main(String args[])

	{
		int[] inputArray = { -2, 0, 2, 4, 5, 8, 2, 1, 6, 9, 35 };
		removeDuplicates(inputArray);
		for (int i = 0; i < inputArray.length-1; i++) {
			System.out.println(inputArray[i]);
		}
	}

	public static int[] removeDuplicates(int[] arr) {

		int end = arr.length;

		for (int i = 0; i < end; i++) {
			for (int j = i + 1; j < end; j++) {
				if (arr[i] == arr[j]) {
					int shiftLeft = j;
					for (int k = j + 1; k < end; k++, shiftLeft++) {
						arr[shiftLeft] = arr[k];
					}
					end--;
					j--;
				}
			}
		}

		int[] whitelist = new int[end];
		for (int i = 0; i < end; i++) {
			whitelist[i] = arr[i];
		}
		return whitelist;
	}

}

package com.General;

import java.util.Scanner;

public class MirrorImage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		// logic for finding the factors for a number
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(i);

				int j = i;
				int rev = 0;
				while (j != 0) {
					int r = j % 10;
					rev = (rev * 10) + r;
					j = j / 10;

				}
				if (rev * i == n) {
					System.out.println("Mirror images are" + i + "   " + rev);
					break;
				}
			}

		}

	}

}

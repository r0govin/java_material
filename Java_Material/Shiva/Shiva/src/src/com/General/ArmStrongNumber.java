package com.General;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum = sum + r * r * r;
			n = n / 10;
		}
		System.out.println(sum);
		if(n==sum)
		{
			System.out.println("The given number is armstrong");
		}
		else
		{
			System.out.println("the given number is not a armstrong");
		}

	}

}

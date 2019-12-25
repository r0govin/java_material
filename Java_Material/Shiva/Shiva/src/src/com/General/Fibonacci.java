package com.General;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		int prev=0;
		int next=1;
		System.out.println("fibonacci Series is"+prev+" "+next);
		int sum=0;
		for (int i=2;i<n;i++)
		{
			sum=prev+next;
			System.out.println(sum);
			prev=next;
			next=sum;
		}
	}
	
	
}

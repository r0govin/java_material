package com.puzzle;

public class ThreadsLimits extends Thread {

	static volatile int x;

	public void run() {
		for (int i = 0; i < 10; i++) {
			int temp = x;
			temp++;
			x = temp;
		}
		System.out.println(x);

	}

	public static void main(String[] args) {
		Thread t1 = new ThreadsLimits();
		Thread t2 = new ThreadsLimits();

		t1.start();

		t2.start();

	}

}

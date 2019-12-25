package com.collections;

public class EqualityCheckMain {

	public static void main(String[] args) {

		Country india1 = new Country();
		india1.setName("india");
		Country india2 = new Country();
		india2.setName("india");
		// To check the equality between two Objects

		System.out.println("is india1 is equal to india2: "
				+ india1.equals(india2));

	}
}

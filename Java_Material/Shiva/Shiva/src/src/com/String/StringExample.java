package com.String;

public class StringExample {

	public static void main(String[] args) {

		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");
		final String s4 = s3.intern();

		//When the intern() method is invoked on a String object it looks the string contained by this String object in the pool, if the string is found there then the string from the pool is returned. Otherwise, this String object is added to the pool and a reference to this String object is returned.
		
		System.out.println(s1 == s2); // true
		System.out.println(s2 == s3); // false
		System.out.println(s3 == s4);// false
		System.out.println(s1 == s3);// false
		System.out.println(s1 == s4);// true

		System.out.println(s1.equals(s2)); // true
		System.out.println(s2.equals(s3)); // true
		System.out.println(s3.equals(s4)); // true
		System.out.println(s1.equals(s4)); // true
		System.out.println(s1.equals(s3)); // true
	}

}

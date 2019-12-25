package com.siva.StringClass;

public class StringFuctions {

	public static void main(String[] args) {

		String s1 = "Hello this is Stirng  ";
		String s2 = "Heelleo";
		String s3 = "Heelleo";
		String s4 = new String("Heelleo");

		Integer i1 = 10;
		Integer i2 = 10;

		Integer i3 = new Integer(100);
		Integer i4 = new Integer(200);

		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());

		System.out.println(i3.hashCode());
		System.out.println(i4.hashCode());

		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		System.out.println(s4.hashCode());

		System.out.println(s1.charAt(4));

		System.out.println(s1.substring(4, 7).hashCode());

		System.out.println(s1.substring(1, 8).hashCode());

		System.out.println(s1.indexOf("Sti"));

		System.out.println(s1.toUpperCase());

		System.out.println(s1.indexOf("z"));

		System.out.println(s1.startsWith("H"));

		System.out.println(s1.substring(4, 10));

		System.out.println(s1.replace(" ", "ZZ"));

		System.out.println(s1.replaceAll("t", "T"));

		System.out.println(s1.intern());

		System.out.println(s1.concat(" This is other String   "));
		System.out.println(s1.length());

		System.out.println(s1.trim().length());

		System.out.println(s1.hashCode());

	}

}

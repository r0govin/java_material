package com.String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DataDictionary {

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();
		s.add("apple");
		s.add("appe");
		s.add("banana");
		s.add("orange");
		s.add("axe");
		System.out.println(s);

		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Search Crieteria");
		String search = sc.nextLine();

		for (String str1 : s) {
			if (str1.startsWith(search)) {
				System.out.println(str1 + " ");
			}
		}
	}

}

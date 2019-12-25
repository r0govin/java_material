package com.String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String");
		String s = sc.nextLine();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();
		int length = ch.length;

		int i = 0;
		while (i < length) {
			char ch1 = ch[i];
			if (map.containsKey(ch1)) {
				map.put(ch1, map.get(ch1) + 1);
			} else {
				map.put(ch1, 1);
			}
			i++;
		}

		// Iterating the Map using entrySet with java iterator
		System.out.println("Iterating the Map using entrySet");
		Iterator<Entry<Character, Integer>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Character, Integer> mapObj = itr.next();
			System.out
					.println(mapObj.getKey() + "------->" + mapObj.getValue());
		}

		// Iterating the Map using entrySet with foreachloop
		System.out.println("Iterating the Map using entrySet with foreachloop");

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "------>" + entry.getValue());
		}

		// Iterating the map using keySet() with iterator
		System.out.println("Iterating the Map using KeySet");
		Iterator<Character> itr1 = map.keySet().iterator();
		while (itr1.hasNext()) {
			Character keyObj = itr1.next();
			System.out.println(keyObj + "------->" + map.get(keyObj));
		}

		// Iterating over the map using keySet() with foreachloop
		System.out
				.println("Iterating over the map using keySet() with foreachloop");
		for (Character ch1 : map.keySet()) {

			System.out.println(ch1 + "------------->" + map.get(ch1));

		}

	}
}

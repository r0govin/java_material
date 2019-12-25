package com.collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEqualityMain {

	public static void main(String[] args) {

		Country india1 = new Country();
		india1.setName("india");
		Country india2 = new Country();
		india2.setName("india");
		HashMap<Country, String> countryMap = new HashMap<Country, String>();
		countryMap.put(india1, "delhi");
		countryMap.put(india2, "delhi");

		Iterator<Country> itr = countryMap.keySet().iterator();
		while (itr.hasNext()) {
			Country keyObj = itr.next();
			String capital = countryMap.get(keyObj);

			// with out overriding we will get 2 india objects so we have to
			// over ride the hashcode
			System.out.println(keyObj.getName() + "------->" + capital);
		}

	}

}

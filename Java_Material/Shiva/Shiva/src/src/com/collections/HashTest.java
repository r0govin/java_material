package com.collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashTest {

	public static void main(String[] args) {
	Country india = new Country("india", 10000);
	Country japan = new Country("japan", 10000);
		Country france = new Country("france", 10000);
		Country Russia = new Country("Russia", 10000);

		HashMap<Country, String> countryCapitalMap = new HashMap<Country, String>();

		countryCapitalMap.put(india, "delhi");
		countryCapitalMap.put(japan, "Tokyo");
		countryCapitalMap.put(france, "paris");
		countryCapitalMap.put(Russia, "maskow");

		System.out.println(countryCapitalMap);

		System.out.println(countryCapitalMap.get(india));

		System.out.println(countryCapitalMap.get(japan));
		System.out.println(countryCapitalMap.get(france));
		System.out.println(countryCapitalMap.get(Russia));

		Iterator<Country> countryCapitalIter = countryCapitalMap.keySet()
				.iterator();// put debug point at this line
		while (countryCapitalIter.hasNext()) {
			Country countryObj = countryCapitalIter.next();
			String capital = countryCapitalMap.get(countryObj);
			System.out.println(countryObj.getName() + "----" + capital);
		}
	}

}

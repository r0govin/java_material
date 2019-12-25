package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparableMain {

	public static void main(String[] args) {
		Country1 india = new Country1(3, "india");
		Country1 brazil = new Country1(2, "brazil");
		Country1 japan = new Country1(1, "japan");
		Country1 china = new Country1(5, "china");

		ArrayList<Country1> al = new ArrayList<Country1>();
		al.add(india);
		al.add(brazil);
		al.add(japan);
		al.add(china);

		Iterator<Country1> itr = al.iterator();
		while (itr.hasNext())

		{
			Country1 country = itr.next();
			System.out.println(country.getId() + "---------"
					+ country.getName());
		}

		Collections.sort(al);

		Iterator<Country1> itr1 = al.iterator();
		while (itr1.hasNext())

		{
			Country1 country = itr1.next();
			System.out.println(country.getId() + "---------"
					+ country.getName());
		}
	}

}

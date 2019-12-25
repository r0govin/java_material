package com.collections;

public class Country1 implements Comparable<Country1> {
	int id;
	String name;
	long population;

	public Country1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	// @Override
	// public int hashCode() {
	// if (this.name.length() % 2 == 0)
	// return 31;
	// else
	// return 95;
	// }
	//
	// @Override
	// public boolean equals(Object obj) {
	//
	// Country other = (Country) obj;
	// if (name.equalsIgnoreCase((other.name)))
	// return true;
	// return false;
	// }

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		Country country = (Country) obj;
		if (name == country.getName()
				|| (name != null && name.equals(country.getName())))

		{
			return true;
		}

		return false;

	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + ((name == null) ? 0 : name.hashCode());
		return result;

	}

	@Override
	public int compareTo(Country1 country) {
		// return (this.id < country.id) ? -1 : ((this.id > country.id ? 1 :
		// 0));
		return this.name.compareTo(country.getName());
	}

}

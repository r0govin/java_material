package com.oops;


public class equality {

	public static void main(String[] args) {
		Integer i = new Integer(1);
		Integer i2 = new Integer(1);

		if (i.equals(i2)) {
			System.out.println("true" + i.hashCode());
		} else
			System.out.println("false" + i2.hashCode());

		Country c1 = new Country("india", 10000);
		Country c2 = new Country("india", 10000);

		if (c1.equals(c2)) {
			System.out.println("true");
		} else
			System.out.println("false" + c1.hashCode() + " " + c2.hashCode());
	}
	
	
}

class Country {
	private String name;
	private long population;

	Country(String name, long population) {
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return name;
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

	
	@Override  
	 public boolean equals(Object obj) {  
	    
	  Country country = (Country) obj;  
	   if (name.equalsIgnoreCase((country.name)))  
	   return true;  
	  return false;  
	 }  
	
}

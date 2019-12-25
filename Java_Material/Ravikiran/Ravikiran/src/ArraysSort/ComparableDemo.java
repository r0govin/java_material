package ArraysSort;

import java.util.Arrays;

public class ComparableDemo {
	public static void main (String arg[]){
	
		Employee e1 = new Employee(1, "kiran", "Bangalore");
		Employee e2 = new Employee(2, "Ram", "Mangalore");
		Employee e3 = new Employee(4, "Archana", "Mysore");
		Employee e4 = new Employee(3, "Bavana", "Bangalore");
		Employee e5 = new Employee(5, "Anandi", "Hyderbad");
		
		Employee[] emplist = {e1, e2, e3, e4, e5};
		
		System.out.println("UnSorted List");
		
		for (int i =0 ; i < emplist.length ; i++){
			System.out.println(emplist[i]);
		}
		
		Arrays.sort(emplist);
		
		System.out.println("Sorted List");
		
		for (int i =0 ; i < emplist.length ; i++){
			System.out.println(emplist[i]);
		}
	}
}

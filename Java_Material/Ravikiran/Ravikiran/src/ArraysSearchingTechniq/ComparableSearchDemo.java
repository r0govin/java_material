package ArraysSearchingTechniq;

import java.util.Arrays;

public class ComparableSearchDemo {

	public static void main(String arg[]) {

		Employee e1 = new Employee(1, "kiran", "Bangalore");
		Employee e2 = new Employee(2, "Ram", "Mangalore");
		Employee e3 = new Employee(4, "Archana", "Mysore");
		Employee e4 = new Employee(3, "Bavana", "Bangalore");
		Employee e5 = new Employee(5, "Anandi", "Hyderbad");

		Employee[] emplist = { e1, e2, e3, e4, e5 };
		
		Employee element = e2;
		
		Arrays.sort(emplist);

		if (Arrays.binarySearch(emplist, e2)>=0){
			System.out.println("Im in");
			System.out.println("Element found " + element);
		}
		
	}
}

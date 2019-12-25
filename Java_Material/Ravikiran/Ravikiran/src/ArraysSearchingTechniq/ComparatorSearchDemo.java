package ArraysSearchingTechniq;

import java.util.Arrays;



public class ComparatorSearchDemo {
	public static void main(String arg[]) {

		Student s1 = new Student(1, "Archana", "Bangalore");
		Student s2 = new Student(2, "Sham", "Bangalore");
		Student s3 = new Student(4, "kiran", "Mangalore");
		Student s4 = new Student(8, "Sharada", "Sringeri");
		Student s5 = new Student(3, "Bhavana", "Mysore");
		Student s6 = new Student(5, "Arpita", "Mangalore");
		Student s7 = new Student(1, "Sunder", "Mysore");

		Student[] stdlist = { s1, s2, s3, s4, s5, s6, s7 };

		Student element = s2;
		
		if (Arrays.binarySearch(stdlist, s2, new SortId()) >=0){
			System.out.println("Element found " + element);
		}
	}
}

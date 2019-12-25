package ArraysSort;

import java.util.Arrays;



public class ComparatorDemo {
	public static void main (String arg[]){
		
		
		Student e1  = new Student(1,"Archana", "Bangalore");
		Student e2  = new Student(2,"Sham", "Bangalore");
		Student e3  = new Student(4,"kiran", "Mangalore");
		Student e4  = new Student(8,"Sharada", "Sringeri");
		Student e5  = new Student(3,"Bhavana", "Mysore");
		Student e6  = new Student(5,"Arpita", "Mangalore");
		Student e7  = new Student(1,"Sunder", "Mysore");
		

		Student[] stdlist = {e1,e2,e3, e4, e5, e6, e7};
		
      System.out.println("UnSorted List");
		
		for (int i =0 ; i < stdlist.length ; i++){
			System.out.println(stdlist[i]);
		}
		
		Arrays.sort(stdlist, new SortName());
		

		
		System.out.println("Sorted Name List");
		
		for (int i =0 ; i < stdlist.length ; i++){
			System.out.println(stdlist[i]);
		}
		
		System.out.println("Sorted ID List");
		Arrays.sort(stdlist, new SortId());
		for (int i =0 ; i < stdlist.length ; i++){
			System.out.println(stdlist[i]);
		}
	}
}

package CollectionSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparatorDemo {
	public static void main (String arg[]){
		List<Student> al = new ArrayList<Student>();
		
		Student e1  = new Student(1,"Archana", "Bangalore");
		Student e2  = new Student(2,"Sham", "Bangalore");
		Student e3  = new Student(4,"kiran", "Mangalore");
		Student e4  = new Student(8,"Sharada", "Sringeri");
		Student e5  = new Student(3,"Bhavana", "Mysore");
		Student e6  = new Student(5,"Arpita", "Mangalore");
		Student e7  = new Student(1,"Sunder", "Mysore");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		al.add(e7);

		Iterator<Student> itr = al.iterator();
		System.out.println("UnSorted Collection");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		Collections.sort(al, new SortId());
		
		Iterator<Student> itr1 = al.iterator();
		System.out.println("Sorted ID Collection");
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}	
		
		Collections.sort(al, new SortName());
		Iterator<Student> itr2 = al.iterator();
		System.out.println("Sorted SortName Collection");
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
		
	}
}

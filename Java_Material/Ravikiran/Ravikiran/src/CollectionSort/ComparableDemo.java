package CollectionSort;
import java.util.*;

public class ComparableDemo {

	
	public static void main (String arg[]){
		List<Employee> al = new ArrayList<Employee>();
		
		Employee e1  = new Employee(1,"Archana", "Bangalore");
		Employee e2  = new Employee(2,"Sham", "Bangalore");
		Employee e3  = new Employee(4,"kiran", "Mangalore");
		Employee e4  = new Employee(8,"Sharada", "Sringeri");
		Employee e5  = new Employee(3,"Bhavana", "Mysore");
		Employee e6  = new Employee(5,"Arpita", "Mangalore");
		Employee e7  = new Employee(1,"Sunder", "Mysore");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		al.add(e7);

		Iterator<Employee> itr = al.iterator();
		System.out.println("UnSorted Collection");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		Collections.sort(al);
		
		Iterator<Employee> itr1 = al.iterator();
		System.out.println("Sorted Collection");
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		
		
		
		
		
		
		
	}
	
}

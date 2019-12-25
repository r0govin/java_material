package CollectionSort;
import java.util.*;

public class Student {
	 int id;
	 String name;
	 String loc;
	public Student(int id, String name, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", loc=" + loc + "]";
	}

	
}

class SortName implements Comparator<Object> 
{

	public int compare(Object obj1, Object obj2) {
		
		Student o1 = (Student)obj1;
		Student o2 = (Student)obj2;
		
		return o1.name.compareTo(o2.name);
	}
	
}

class SortId implements Comparator<Object> 
{

	public int compare(Object obj1, Object obj2) {
		
		Student o1 = (Student)obj1;
		Student o2 = (Student)obj2;
		if (o1.id < o2.id)
			return -1;
		if (o1.id > o2.id)
			return 1;		
		else
			return 0;
	}
	
}


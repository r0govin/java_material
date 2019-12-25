package CompInter;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TstComparator {
	
	public static void main (String arg[])
	{
		TreeMap<Product, String> tm = new TreeMap<Product, String>(new SortName());	
		tm.put(new Product(1,"Ravi"), "Bangalore");
		tm.put(new Product(6,"Raghu"), "darwad");
		tm.put(new Product(4,"sham"), "shringeri");
		tm.put(new Product(7,"Abdulla"), "indupura");
		tm.put(new Product(2,"kiran"), "Mysore");
		tm.put(new Product(8,"Sunder"), "nothing");
		
		for(Entry<Product, String> et : tm.entrySet())
		{
		   System.out.println("Key " + et.getKey()+ " Value " + et.getValue());	
		}
	}

}

class SortName implements Comparator <Product>
{

	public int compare(Product o1, Product o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}

class SortId implements Comparator <Product>
{

	public int compare(Product o1, Product o2) {
		
		if (o1.id < o2.id)
			return -1;
		if (o1.id > o2.id)
			return 1;		
		else
			return 0;
	}
	
}


class Product 
{
 int id;
 String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public Product(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + "]";
}

 	
}

package CompInter;
import java.util.*;
import java.util.Map.Entry;
public class TstComparable {

	public static void main (String arg[])
	{
		TreeMap<MyItem, String> tm = new TreeMap<MyItem, String>();
		
		tm.put(new MyItem(1,"Ravi"), "Bangalore");
		tm.put(new MyItem(2,"kiran"), "Mysore");
		tm.put(new MyItem(4,"sham"), "shringeri");
		tm.put(new MyItem(6,"Raghu"), "darwad");
		tm.put(new MyItem(7,"Mahesh"), "indupura");
		tm.put(new MyItem(8,"Sunder"), "nothing");
		
		for(Entry<MyItem, String> et : tm.entrySet())
		{
		   System.out.println("Key " + et.getKey()+ " Value " + et.getValue());	
		}
	}
}

class MyItem implements Comparable<MyItem>
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
public MyItem(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public void setName(String name) {
	this.name = name;
}

@Override

public int compareTo(MyItem item) {

	return this.name.compareTo(item.name);
}

@Override
public String toString() {
	return "MyItem [id=" + id + ", name=" + name + "]";
}
 	
}

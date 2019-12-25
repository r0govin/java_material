package DesignPatternFactory;
import java.util.*;
public class product1 implements ProdItem{

	
	public void itemlist() {
		
		System.out.println("Product 1 item list");
		
		List<String> str = new ArrayList<String>();
		str.add("Mirror");
		str.add("Cables");
		str.add("Handle");
		
		Iterator itr = str.iterator();
		
		for (String s: str)
		{
			System.out.println(s);
		}
		
	}

}

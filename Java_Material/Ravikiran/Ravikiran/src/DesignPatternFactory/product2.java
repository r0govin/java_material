package DesignPatternFactory;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class product2 implements ProdItem {
	
     public void itemlist() {
		
		System.out.println("Product 2 item list");
		List<String> str = new ArrayList<String>();
		str.add("Seat");
		str.add("Bolt");
		str.add("Nuts");
		
		
	}

}

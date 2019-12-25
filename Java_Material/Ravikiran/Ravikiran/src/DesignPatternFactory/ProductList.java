package DesignPatternFactory;

public class ProductList {	
  public static void main (String arg[]) 
  {
	  ProdFactory items = new ProdFactory();
	  ProdItem item1 = items.getItem("product1");
	  item1.itemlist();
	  ProdItem item2 = items.getItem("product2");
	  item2.itemlist();
	  ProdItem item3 = items.getItem("product3");
	  item3.itemlist();  
  }   
}

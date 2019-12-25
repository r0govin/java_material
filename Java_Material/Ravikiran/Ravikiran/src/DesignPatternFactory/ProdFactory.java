package DesignPatternFactory;

public class ProdFactory {

	public ProdItem getItem(String product){
	      if(product == null){
	         return null;
	      }			
       if(product.equalsIgnoreCase("product1"))
         {
           return new product1();
        } 
       else if(product.equalsIgnoreCase("product2")){
       return new product2();      
        }
       
       else if(product.equalsIgnoreCase("product3")){
       return new product3();
    }
    
    return null;
 }
}

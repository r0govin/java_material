package DesignPatternSingleton;

public class Singleton2 {
	
	public static void main (String arg[]) {
		StaticBlockSingleton.showMessage();
		
	}

}

class StaticBlockSingleton{
	
   private static StaticBlockSingleton s;
   private StaticBlockSingleton(){}
   
   static {
	   
	   try {
		  s = new StaticBlockSingleton();
	   }
	   catch (Exception e){
		   throw new RuntimeException("Exception occured in creating singleton instance");
	   }
   }

public static StaticBlockSingleton getS() {
	return s;
}
   
public static void showMessage(){
	System.out.println("Static Singleton");
}
  
   
}
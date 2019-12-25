package DesignPatternSingleton;

public class Singleton1 {
  
	public static void main (String arg[]){
		EagerInitializedSingleton.display();
	//	System.out.println(EagerInitializedSingleton.getS());
	}
	
}


class EagerInitializedSingleton{
	
	private static final EagerInitializedSingleton s = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton(){}

	public static EagerInitializedSingleton getS() {
		return s;
	}
	
	public static void display(){
		System.out.println("Hello Singleton");
	}
	
}

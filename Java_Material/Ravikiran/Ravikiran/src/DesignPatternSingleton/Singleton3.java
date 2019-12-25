package DesignPatternSingleton;

public class Singleton3 {
	
	public static void main (String arg[])
	{
		LazyInitializedSingleton.getLazySingleton();
		LazyInitializedSingleton.showMessage();
	}

}

class LazyInitializedSingleton{

	private static LazyInitializedSingleton lazySingleton;
	private LazyInitializedSingleton(){}
	public static LazyInitializedSingleton getLazySingleton() {
		if (lazySingleton ==null){
			lazySingleton = new LazyInitializedSingleton();
		}
		return lazySingleton;
	}
	
	public static void showMessage(){
		System.out.println("Lazy Initialization ---> " + lazySingleton);
	}
	
}
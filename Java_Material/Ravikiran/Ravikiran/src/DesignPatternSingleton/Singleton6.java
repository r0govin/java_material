package DesignPatternSingleton;

public class  Singleton6 {
	public static void main (String arg[]){
		System.out.println(EnumSingleton.Instance1);
	}
}

enum EnumSingleton {
	Instance1;
}



package DesignPatternSingleton;

public class Singleton5 {
  public static void main (String arg[]){
	 BillPughSingleton.getbillInstance();
     BillPughSingleton.showMessage();
  }
}

class BillPughSingleton {
	
	private BillPughSingleton(){}
	
	private static class billHelper {	    
		private static final BillPughSingleton billInstance =  new BillPughSingleton(); 
	}
	
	public static BillPughSingleton getbillInstance()
	{
		return billHelper.billInstance;
	}
	
	public static void showMessage(){
		System.out.println("BillPughSingleton Initialization ---> " + billHelper.billInstance);
	}
}
package myDesign;

public class CarFactory {
	public static currency createCurrency (String str){
		if (str.equalsIgnoreCase("India")){
			return new rupee();
		}
		if (str.equalsIgnoreCase("singapore")){
			return new SGUSD();
		}		
		if (str.equalsIgnoreCase("USA")){
			return new USD();
		}	
		return null;
	}
	
}

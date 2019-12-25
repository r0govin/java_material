package tstDesign;

class employeeFactory{
	public static employeeInfo getInfo(String str){
		if (str.equalsIgnoreCase("India")){
			return new Offshore();
		}
		if (str.equalsIgnoreCase("USA")){
			return new OnShore();
		}
		return null;
	}
}


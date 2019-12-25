package tstDesign;

public class demo {

	public static void main(String[] args) {
		String str1 = "India";
		employeeFactory.getInfo(str1).employDetails();	
		String str2 = "USA";
		employeeFactory.getInfo(str2).employDetails();
	}

}

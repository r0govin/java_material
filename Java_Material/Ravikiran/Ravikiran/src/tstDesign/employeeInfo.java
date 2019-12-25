package tstDesign;
import java.util.*;
public interface employeeInfo {
	public void employDetails();
}

class Offshore implements employeeInfo{
    
	Map <String, Integer> mp = new HashMap<String,Integer>();
	
	public void employDetails() {
			System.out.println("employees working in Offshore");
			mp.put("Kiran", 123);
			mp.put("Sham",345);
			System.out.println(mp);
	}	
}

class OnShore implements employeeInfo{
	Map <String, Integer> mp = new HashMap<String,Integer>();
	public void employDetails() {
		System.out.println("employees working in OnShore");
		mp.put("James", 321);
		mp.put("Michael",654);
		System.out.println(mp);
		
	}
}
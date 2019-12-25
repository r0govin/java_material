package ExceptionDemo;

public class ExceptDemo {
	public static void main (String arg[]){
		
		Employee e1 = new Employee(7,"Ram", "Ban", 10000);
		Employee e2 = new Employee(2,"Sham", "Man", 20000);
		Employee e3 = new Employee(6,"Praveen", "Kolar", 30000);
		try {
			e1.addSal(1250);
          	}
	     catch(RaviException e){
		e.printStackTrace();
	    }
	}
}

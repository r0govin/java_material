package ExceptionDemo;

public class Employee {

	private int id;
	private String name;
	private String loc;
	private long salary;
	public Employee(int id, String name, String loc, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.salary = salary;
	}
	
	 public void addSal(long Salry) throws RaviException{
		      System.out.println("Current Employee Salary " + salary);
			  this.salary = this.salary+ salary;
			  System.out.println("Added Employee Salary " + salary);
			  throw new RaviException("Invalid Salary") ;
	 }	

}

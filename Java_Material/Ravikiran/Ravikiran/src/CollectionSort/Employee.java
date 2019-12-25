package CollectionSort;

public class Employee implements Comparable{

	private int id;
	private String name;
	private String loc;
	public int getId() {
		return id;
	}
	
	
	
	public Employee(int id, String name, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
	}



	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", loc=" + loc + "]";
	}



	@Override
	public int compareTo(Object arg) {
		
		Employee e = (Employee)arg ;
		
		return this.name.compareTo(e.name);
	}

}

package Other;

public class InheritanceDemo {
	public static void main (String arg[]){
		
		A a1 = new A();
		B b1 = new B();
		System.out.println(a1.toString());
		b1.overid();
	}

	@Override
	public String toString() {
		return "test1 []";
	}

}

class A {
	
	protected int id = 10;
	protected String name = "kiran";
	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

class B extends A {
	
	public void overid(){
		id = 20;
		name = "Ravi";		
		System.out.println("B [id=" + this.id + ", name=" + this.name + "]");
	}
	
	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}
}
package Other;

public class ImmutableDemo {
   public static void main (String arg[]){	
	   Home h  = new Home("RK Layout",1);
	  System.out.println(h.toString()); ;
   }
	
}

final class Home {
	private final String address;
	private final int id;
	public Home(String address, int id) {
		
		this.address = address;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Home [address=" + address + ", id=" + id + "]";
	}

	
}

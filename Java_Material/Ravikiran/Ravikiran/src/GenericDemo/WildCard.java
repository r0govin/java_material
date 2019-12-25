package GenericDemo;
import java.util.*;

public class WildCard {
	public static void main (String arg[]){
		List<Integer> nu = new ArrayList<Integer>();
		nu.add(1);
		nu.add(2);
		System.out.println(nu);
		
// You Cannnot modify the list when you are using the wildcard in the list.....
		
		List<? extends Number> st = new ArrayList<Integer>(nu);
		nu.add(3);
//		st.add(4);
		System.out.println(st);
		System.out.println(nu);
		
		
	}

}

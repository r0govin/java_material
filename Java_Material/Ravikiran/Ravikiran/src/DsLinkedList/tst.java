package DsLinkedList;
import java.util.*;
public class tst {

	public static void main(String arg[])
	{
		LinkedList ll = new LinkedList();		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		LinkedList ll2 = new LinkedList();
		ll2.add(6);
		ll2.add(7);
		
		Set<LinkedList>s = new HashSet<LinkedList>();
		s.add(ll);
		s.add(ll2);
		System.out.println(s);
		
		
	}
}

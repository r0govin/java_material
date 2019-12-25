package DsStack;

public class StackListImplemt {
	
	public static void main (String arg[])
	{
		StackLink st = new StackLink();
		st.push(112);
		st.push(125);
		
		st.display();
		System.out.println("Peek " + st.peek());
		System.out.println("Size " + st.size );
		st.display();
		st.pop();
		st.pop();
		st.display();
		System.out.println("Peek " + st.peek());
		System.out.println("Size " + st.size );
		
	}
}

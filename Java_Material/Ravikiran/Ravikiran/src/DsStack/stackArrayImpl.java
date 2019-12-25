package DsStack;

public class stackArrayImpl {

	public static void main(String arg[])
	{
		StackArray s = new StackArray(10);
		s.push(1);
		s.push(2);
		s.push(3);
		s.display();
		s.push(5);
		s.push(6);
		s.push(7);
		s.display();
		s.pop();
		s.display();
		s.pop();
		s.display();
		s.pop();
		s.pop();
		s.display();		
	}
}

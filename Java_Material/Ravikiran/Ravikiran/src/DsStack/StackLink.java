package DsStack;

public class StackLink {
	
		Node top ;
		int size;	
	
	 public StackLink() 
	    {
			top = new Node(null);
			size = 0;			
		}
	 
	 public boolean isEmpty()
	     {
	         return top == null;
	     }  
	 
	 public int getSize()
	    {
	         return size;
	    } 
	 
	 public void push(Object data)
	    {
	         Node temp = new Node (data);
	         
	        if (top == null)
	            top = temp;
	        else
	        	
	        /*below is main funda.. check code carefully*/	
	         {
	        	temp.setNext(top);
	        	top = temp;
	         }
	        size++ ;
	     }  

	    public Object pop()
	     {
	        if (isEmpty() )
	            System.out.println("Stack is Empty ");
	         Node temp = top;
	         /*below is main funda.. check code carefully*/	
	         top = temp.getNext();
	         size-- ;
	        return temp.getData();
	     } 

	    public Object peek()
	       {
	           if (isEmpty() )
	                System.out.println("Stack is Empty");
	            return top.getData();
	       }
	    
	    public void display()
	       {
	           
	           if (size == 0) 
	             {
	                System.out.print("Empty\n");
	                return ;
	            }
	            Node ptr = top;
	            while (ptr != null)
	            {
	                System.out.print("["+ptr.getData()+"]");
	                ptr = ptr.getNext();
	            }
	            System.out.println();        
	         }


	class Node
	{
		// reference to the next node in the chain,
		// or null if there isn't one.
		Node next;
		// data carried by this node.
		// could be of any type you need.
		Object data;
		

		// Node constructor
		public Node(Object _data)
		{
			next = null;
			data = _data;
		}
		
		
		// these methods should be self-explanatory
		public Object getData()
		{
			return data;
		}
		
		public void setData(Object _data)
		{
			data = _data;
		}
		
		public Node getNext()
		{
			return next;
		}
		
		public void setNext(Node _next)
		{
			next = _next;
		}
	}

}

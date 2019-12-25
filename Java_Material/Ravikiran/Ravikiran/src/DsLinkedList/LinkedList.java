package DsLinkedList;

public class LinkedList
{
	

	// reference to the head node.
	private Node head;
	private int listCount;
	
	// LinkedList constructor
	public LinkedList()
	{
		// this is an empty list, so the reference to the head node
		// is set to a new node with no data
		head = new Node(null);
		listCount = 0;
	}
	
	
	public void add(Object data)
	// post: appends the specified element to the end of this list.
	{
		Node temp = new Node(data);
		Node current = head;
		// starting at the head node, crawl to the end of the list
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		// the last node's "next" reference set to our new node
		current.setNext(temp);
	///	head = current;
		listCount++;// increment the number of elements variable
	}
	
	public void add(Object data, int index)
	// post: inserts the specified element at the specified position in this list.
	{
		Node temp = new Node(data);
		Node current = head;
		// crawl to the requested index or the last element in the list,
		// whichever comes first
		for(int i = 1; i < index && current.getNext() != null; i++)
		{
			current = current.getNext();
		}
		// set the new node's next-node reference to this node's next-node reference
		temp.setNext(current.getNext());
		// now set this node's next-node reference to the new node
		current.setNext(temp);
		listCount++;// increment the number of elements variable
	}
	
	public Object get(int index)
	// post: returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if(index <= 0)
			return null;
		
		Node current = head.getNext();
		for(int i = 1; i < index; i++)
		{
			if(current.getNext() == null)
				return null;
			
			current = current.getNext();
		}
		return current.getData();
	}
	
	public void remove(Object data)
	{
		Node temp = new Node(data);
		Node current = head.getNext();
		 while (current.getNext() != null)
		 {
			 if (current.data == temp.data)
			 {
				current.setNext(temp.getNext().getNext());
			 }		 
			current = current.getNext();
		 }			
	}
	
	
	public boolean remove(int index)
	// post: removes the element at the specified position in this list.
	{
		// if the index is out of range, exit
		if(index < 1 || index > size())
			return false;
		
		Node current = head;
		for(int i = 1; i < index; i++)
		{
			if(current.getNext() == null)
				return false;
			
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		listCount--; // decrement the number of elements variable
		return true;
	}
	
	public int size()
	// post: returns the number of elements in this list.
	{
		return listCount;
	}
	
	public void effFindNodeMidpoint(){
		Node fastNode = head.getNext();
		Node slowNode = head.getNext();
		
		while (fastNode.getNext()!= null && fastNode.getNext().getNext()!= null){
			fastNode = fastNode.getNext().getNext();
			slowNode = slowNode.getNext();
		}
		
		System.out.println(slowNode.getData());
		
	}
	
	
	public void FindNodeMidpoint(){
		Node current = head.getNext();
		int count=0;
		while (current!= null){
			current = current.getNext();				
			count++;
		}
		
		count = count/2;
        Node prev = head.getNext();
		for (int i =0; i < count && prev!= null ; i ++){
			prev = prev.getNext(); 
		}
		System.out.println(prev.getData());
	}
	
	
	public String display()
	{
		Node current = head.getNext();
		String output = "";
		while(current != null)
		{
			
			output += "[" + current.getData() + "]";
			current = current.getNext();
			
		}
		return output;
	}
	
	
	   public void Reverse() 
	   {  
		   Node currNode = head.getNext(); 
		   if (currNode == null || currNode.getNext() == null) 
		     {      
			   return ;        
			   }         
		   Node prevNode,  nextNode;        
		   prevNode = null;        
		   nextNode = null;        
		      
		   while (currNode != null) 
		      {            
			   nextNode = currNode.next;            
			   currNode.next = prevNode;            	
			   prevNode = currNode;            
			   currNode = nextNode;       
			   }   
		   
		   head = new Node(null);
		   head.setNext(prevNode);	
	  }
	
	   public void recursive()
	   {
		   this.recursiveReverse(head);
	   }
	   
	   private void recursiveReverse(Node head )
	   {  
		   Node current = head.getNext();
	    //check for empty list 
	    if(current == null)
	       return;

	   /* if we are at the TAIL node:
	       recursive base case:
	    */
	   if(current.next == null) 
	   { 
	   //set HEAD to current TAIL since we are reversing list
	   head = current; 
	   return; //since this is the base case
	   }

	   recursiveReverse(current.next);
	   current.next.next = current;
	   current.next = null; //set "old" next pointer to NULL
	   }

	   @Override
		public String toString() {
			Node current = head.getNext();
			String output = "";
			while(current != null)
			{			
				output += "[" + current.getData() + "]";
				current = current.getNext();			
			}
			return output;
		}


	
	protected class Node
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
		
		// another Node constructor if we want to
		// specify the node to point to.
		public Node(Object _data, Node _next)
		{
			next = _next;
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

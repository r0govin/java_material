package DsLinkedList;

class Node {

	int data;
	Node next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node(int data) {
		super();
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	public static int  Length(Node headNode)
	{
		int count = 0;
		
		Node CurrentNode = headNode;
		while (CurrentNode!=null)
		{
			count++;
			CurrentNode = CurrentNode.getNext();
			
		}
		
		return count;
	}
	
	public static void traverse(Node headNode)
	{
		if (headNode == null)
			System.out.println("Not valid input");
		Node CurrentNode = headNode;
		while (CurrentNode!=null)
		{
         System.out.println("Data: " +  CurrentNode.getData() + "  Next Pointer : " + CurrentNode.getNext());			
		 CurrentNode = CurrentNode.getNext();
		}
			
		
	}
	
	public  static void  inSert(Node headNode, Node InsertNode, int position)
	
	{
		int size = 0;
		
		if (headNode == null){
			 System.out.println("Value is Null");
			 
		     }
		
		size = Length(headNode);
		if (position > size || (position < 1))
		{
			System.out.println("Invalid Position");
		}
			
		if (position == 1)
		{
			InsertNode.setNext(headNode);
			System.out.println("Node is inserted at postion 1 ");
		}
		if (position <= size)
			
		{
			Node previousNode = headNode;
			 int count = 1;
			   while (count<position-1)
			   {
				   previousNode = previousNode.getNext();
				   count++;
			   }
			   Node CurrentNode = previousNode.getNext();
			   InsertNode.setNext(CurrentNode);
			   previousNode.setNext(InsertNode);
			   
			   System.out.println("Node is inserted at postion " + position);
			 
		}
		
			
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
	
}

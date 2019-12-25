package DsQueue;

public class Queue {

	private Node front;
	private Node rear;
	private int size;
	public Queue(){
		front = null;
		rear = null;
		size = 0;
	}

	public void enqueue(Object data){
		Node temp = new Node(data);
		if (rear == null){
			front = temp;
			rear =  temp;
		}
		else
		{
			rear.setNext(temp);
			rear = rear.getNext();
			size++;
		}	
	}

	public Object dequeue(){

		if (isEmpty()){
			System.out.println("Queue Underflow");
		}

		Node temp = front;
		front = temp.getNext();        
		if (front == null)
			rear = null;
		size-- ;        
		return temp.getData();	     

	}

	public void display(){
		if (size == 0)
		{
			System.out.print("Empty\n");
			return ;
		}
		Node temp = front;
		while (temp != rear.getNext() )
		{
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}
		System.out.println();        
	}




	public int peek()
	{
		if (isEmpty() )
			System.out.println("Underflow Exception");
		return (Integer) front.getData();
	}  

	public int getSize()
	{
		return size;
	}  

	public boolean isEmpty()
	{
		return front == null;
	}    

	protected class Node
	{
		Node next;
		Object data;

		public Node(Object _data)
		{
			next = null;
			data = _data;
		}

		public Node(Object _data, Node _next)
		{
			next = _next;
			data = _data;
		}

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

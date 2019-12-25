package DsQueue;

public class queueImple {
	public static void main (String arg[]){
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(5);
		q.display();
		q.dequeue();
		q.display();
	}

}

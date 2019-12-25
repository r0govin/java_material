package ThreadConcurrent;

import java.util.PriorityQueue;
import java.util.Queue;

public class blQueue {
	public static void main (String arg[]){
		Queue<String>q = new PriorityQueue<String>();
		q.add("Kiran");
		q.add("Ram");
		q.add("Sham");
		
		System.out.println(q);
		q.remove("SSS");
		System.out.println(q);
		
		
	}

}

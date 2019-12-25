package DsLinkedList;

import java.util.Iterator;

public class SinglyLinkedList 
{
  public static void main (String arg[])
  
  {
	  Node n1 = new Node(1);	  
	  Node n2 = new Node(2);
	  Node n3 = new Node(3);
	  Node n4 = new Node(4);
	  Node n5 = new Node(5);
	  Node n6 = new Node(6);
	  
	  Node n9 = new Node(9);
	  
	  n1.setNext(n2);
	  n2.setNext(n3);
	  n3.setNext(n4);
	  n4.setNext(n5);
	  n6.setNext(null);  

	  Node.traverse(n1);
	   int count = Node.Length(n1);
	  System.out.println("count : " + count);
	  Node.inSert(n1, n9, 4);
     System.out.println("After Insertion");
	  
	  Node.traverse(n1);
	  Node.Length(n1); 
  }

  
	
}

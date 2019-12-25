package DsBinaryTree;

public class BinaryImpl {
	
	public static void main (String arg[])
	{
	BinaryTree bt = new BinaryTree();
	bt.insert(5);
	bt.insert(2);
	bt.insert(3);	
	bt.insert(8);
	bt.insert(9);
	bt.insert(4);
	bt.insert(7);
	
    bt.printPaths();
	
	System.out.println("size   " + bt.size());
	
	
	}

}

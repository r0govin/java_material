package DsBinaryTree;

public class BinaryTree {

	private Node root; 

	private class Node { 
		private Node left; 
		private Node right; 
		private  int data; 

		Node(int newData) { 
			left = null; 
			right = null; 
			data = newData; 	
		} 
	}

	public BinaryTree() { 
		root = null; 
	}


	public boolean lookup(int data) { 
		return(lookup(root, data)); 
	}

	private boolean lookup(Node node, int data) { 
		if (node==null) { 
			return(false); 
		} 

		if (data==node.data) { 
			return(true); 
		} 
		else if (data<node.data) { 
			return(lookup(node.left, data)); 
		} 
		else { 
			return(lookup(node.right, data)); 
		} 
	}

	public void insert(int data) { 
		root = insert(root, data); 
	} 

	private Node insert(Node node, int data) { 
		if (node==null) { 
			node = new Node(data); 
		} 
		else { 
			if (data <= node.data) { 
				node.left = insert(node.left, data); 
			} 
			else { 
				node.right = insert(node.right, data); 
			} 
		} 

		return(node); // in any case, return the new pointer to the caller 
	}



	/** 
	  Prints the node values in the "inorder" order. 
	  Uses a recursive helper to do the traversal. 
	 */ 
	public void printTree() { 
		printTree(root); 
		System.out.println(); 
	} 
	private void printTree(Node node) { 
		if (node == null) return; 

		// left, node itself, right 
		printTree(node.left); 
		System.out.print(node.data + "  "); 
		printTree(node.right); 
	}


	/** 
	 Prints the node values in the "postorder" order. 
	 Uses a recursive helper to do the traversal. 
	 */ 
	public void printPostorder() { 
		printPostorder(root); 
		System.out.println(); 
	} 
	private  void printPostorder(Node node) { 
		if (node == null) return; 

		// first recur on both subtrees 
		printPostorder(node.left); 
		printPostorder(node.right); 

		// then deal with the node 
		System.out.print(node.data + "  "); 
	} 

	public void mirror() { 
		mirror(root); 
	} 

	private void mirror(Node node) { 
		if (node != null) { 
			// do the sub-trees 
			mirror(node.left); 
			mirror(node.right); 

			// swap the left/right pointers 
			Node temp = node.left; 
			node.left = node.right; 
			node.right = temp; 
		} 
	} 


	public int size() { 
		return(size(root)); 
	} 
	private int size(Node node) { 
		if (node == null) return(0); 
		else { 
			return(size(node.left) + 1 + size(node.right)); 
		} 
	}



	public int maxDepth() { 
		return(maxDepth(root)); 
	} 
	private int maxDepth(Node node) { 
		if (node==null) { 
			return(0); 
		} 
		else { 
			int lDepth = maxDepth(node.left); 
			int rDepth = maxDepth(node.right); 

			// use the larger + 1 
			return(Math.max(lDepth, rDepth) + 1); 
		} 
	}


	public void printPaths() { 
		int[] path = new int[1000]; 
		printPaths(root, path, 0); 
	} 

	private void printPaths(Node node, int[] path, int pathLen) { 
		if (node==null) return; 

		// append this node to the path array 
		path[pathLen] = node.data; 
		pathLen++; 

		// it's a leaf, so print the path that led to here 
		if (node.left==null && node.right==null) { 
			printArray(path, pathLen); 
		} 
		else { 
			// otherwise try both subtrees 
			printPaths(node.left, path, pathLen); 
			printPaths(node.right, path, pathLen); 
		} 
	}

	private void printArray(int[] ints, int len) { 
		int i; 
		for (i=0; i<len; i++) { 
			System.out.print( " " +ints[i] + " "); 
		} 
		System.out.println(); 
	}	

	/** 
				 Tests if a tree meets the conditions to be a 
				 binary search tree (BST). Uses the efficient 
				 recursive helper. 
	 */ 
	public boolean isBST2() { 
		return( isBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE) ); 
	} 
	/** 
				  Efficient BST helper -- Given a node, and min and max values, 
				  recurs down the tree to verify that it is a BST, and that all 
				  its nodes are within the min..max range. Works in O(n) time -- 
				  visits each node only once. 
	 */ 
	private boolean isBST2(Node node, int min, int max) { 
		if (node==null) { 
			return(true); 
		} 
		else { 
			// left should be in range  min...node.data 
			boolean leftOk = isBST2(node.left, min, node.data); 

			// if the left is not ok, bail out 
			if (!leftOk) return(false); 

			// right should be in range node.data+1..max 
			boolean rightOk = isBST2(node.right, node.data+1, max); 

			return(rightOk); 
		} 
	} 



}

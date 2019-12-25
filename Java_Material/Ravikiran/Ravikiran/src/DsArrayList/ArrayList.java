package DsArrayList;

import java.util.List;

public class ArrayList <E>{

	private Object[] data; // list itself. null values at the end
	private int capacity; // maximum capacity of the list
	private int num; // current size of the list
	private static final int DEFAULT_CAPACITY = 10;
	
	public ArrayList() {
		this(DEFAULT_CAPACITY); // call MyList(capacity).
		}

	public ArrayList(int capacity) {
		this.capacity = capacity;
		data = new Object[capacity]; // null array
		num = 0;
		}
	
	public int length()
	{
		return num;
	}
		
	public void add(Object a) 
	 {
		if (num == capacity) 
		{
		Object[] datanew = new Object[capacity*2];
		capacity = capacity*2;
		// copy old data to new data
		for (int i = 0; i < num; i++) 
		   {
		datanew[i] = data[i];
		    }
		data = datanew; // data now refers to he new array
		}
		
		data[num] = a;
		num++;
	 }
	
	public  E  getIndex(int index) {
		// find the element at given index
		if (index < 0 || index >= num) {
		System.out.println("index out of bounds");
		}
		return   (E) data[index];
		}
	
	public void deleteLastElement() {
		// delete the last element from the list
		// fill in the code in the class.
		if (num == 0) {
		System.out.println("list is empty: cannot delete");
		}
		num--;
		data[num] = null;
		}
	
	public void deleteFirstElement() {
		// delete first element from the list
		for (int i = 0; i < num-1; i++) {
		data[i] = data[i+1];
		}
		data[num-1] = null;
		num--; // IMPORTANT. Re-establish invariant
		}
	
	
	public void remove(Object r)
	{
	   int temp = 0;
		for (int i = 0; i < num-1 ; i ++)
		{
		  if (data[i] == r)
		  {
			  temp = i ;	
			  for (int j = temp ; j <num-1 ; j ++)
				{
					data[j] = data[j+1];
				}
				data[num-1] = null;
				num--;
		  }
		}			
	}
	
}

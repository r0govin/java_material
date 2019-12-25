package DsStack;

public class StackArray {
	int top;
	Object[] stackArray;
	int size;
	
	
	public StackArray(int arraySize){
        size=arraySize;
        stackArray= new Object[size];
        top=-1;
    }

	public void push(Object value){
        if(top==size-1){
            System.out.println("Stack is full, can't push a value");
        }
        else{

            top=top+1;
            stackArray[top]=value;
        }
    }
	public void pop(){
        if(!isEmpty())
            top=top-1;
        else{
            System.out.println("Can't pop...stack is empty");
        }
    }

	  public boolean isEmpty(){
	        return top==-1;
	    }
	 
	public void display() 
	{
		System.out.println();
		for(int i=0;i<=top;i++)
		{
        System.out.print( "[" + stackArray[i] + "]" + "");      
		}
	}
	
}
	
	


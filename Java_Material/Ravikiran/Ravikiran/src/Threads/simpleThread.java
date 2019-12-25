package Threads;



public class simpleThread {
	
	public static void main (String arg[])
	{
		myThread sharedRunnableInstance = new myThread();
		Thread t1 = new Thread(sharedRunnableInstance);
        Thread t2 = new Thread(sharedRunnableInstance) ;	
        
        
	}
	
}
class  myThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello How may Help you: " + Thread.currentThread().getName());
	}
	
}
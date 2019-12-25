package Threads;

public class testRW implements Runnable{
 
	public static void main (String arg[]) {
		

		testRW shared = new testRW();
		Thread t1 = new Thread(shared);
		Thread t2 = new Thread(shared);
		Thread t3 = new Thread(shared);
		t1.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method");	
	}


}

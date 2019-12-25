package DesignPatternSingleton;

public class Singleton4 {

	public static void main(String arg[]){
	//	ThreadSafeSingleton.getThreadSingleton() ;
		ThreadSafeSingleton.showMessage();
	}
}

class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton  threadSingleton;
	private ThreadSafeSingleton(){}
	public static  ThreadSafeSingleton getThreadSingleton() {
		 if (threadSingleton == null){
			 
			 synchronized (ThreadSafeSingleton.class){
				 threadSingleton = new ThreadSafeSingleton();}
		 }
		return threadSingleton;
	}
	public static void showMessage(){
		System.out.println("Thread Initialization ---> " + threadSingleton);
	}
	
	
}
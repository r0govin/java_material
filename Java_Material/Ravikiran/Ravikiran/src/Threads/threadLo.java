package Threads;

import Threads.Threadloc.MyRunnable;

public class threadLo {
	
	public static class MyRunnable implements Runnable {

        private ThreadLocal<Long> threadLocal =
               new ThreadLocal<Long>();

        @Override
        public void run() {
            threadLocal.set( (long) (Math.random() * 1000D) );
    
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
    
            System.out.println(threadLocal.get());
        }
    }
	
	
	public static void main(String[] args) {
        MyRunnable sharedRunnableInstance = new MyRunnable();

        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);

        thread1.start();;
        thread2.start();
    }
}

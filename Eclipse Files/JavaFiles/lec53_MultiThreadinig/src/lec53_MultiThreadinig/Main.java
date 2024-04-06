package lec53_MultiThreadinig;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//multithreading= process of executing multiple threads simultaneously
//						  helps maximum utilization of cpu
//						  Threads are independent, they don't affect the execution of other threads.
//						  An exception in one thread will not interrupt other threads.
//						  useful for serving multiple clients.multiplayer games or other mutually independent tasks
		
		
		
		
		
		
		MyThreads thread1=new MyThreads();
		
		MyRunnable runnable1= new MyRunnable();
		Thread thread2=new Thread(runnable1);
		
//		thread1.setDaemon(true);
//		thread2.setDaemon(true);
		
		
		
		thread1.start();
			
		thread1.join(3000);//by specifying the seconds you can tell how long after the second thread can join.or calling thread (ex.main) wait untill the specified thread dies or x amount of milliseconds. 
		
		
		
		thread2.start();
		
		
//		System.out.println(1/0);
		
		
		
		
		
		
		
		

	}

}

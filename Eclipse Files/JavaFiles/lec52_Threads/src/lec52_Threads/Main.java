package lec52_Threads;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		
		//thread= a thread of execution in  a program(like a virtual CPU)
//					JVM allows multiple threads a to run concurrently
//					each thread can execute parts of the code in parallel with the main thread
//					each thread has a priority.

//		A JVM allows a thread to run up untill one of the following occurs:
//			1)The exit method of class runtime has been called
//			2)All user threads have died
		
		
//		As soon as JVM starts running there is a thread that calls the main Method . This  thread is called "main" 
		
//		greater number=higher priority		
		
//      Daemon Thread low priority thread that runs in the background to perform garbage collection.
//		JVM terminates itself when all user threads(non-daemon threads) finish their execution
		
		
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("myThread");
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getPriority());//between 1 and 10
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		
		
		System.out.println(Thread.currentThread().isAlive());
		
		
		for(int i=3;i>0;i--) {
			
			
			System.out.println(i);
			
			
			Thread.sleep(1000);//1sec
		}
		System.out.println("GO!!");
		
//		
		MyThread thread2=new MyThread();
//		
//		
//		System.out.println(thread2.isAlive());
//		System.out.println(thread2.getName());
//		thread2.start();
//		System.out.println(thread2.isAlive());
//		System.out.println(thread2.getName());//this becomes 10 because the thread that created this thread has been set to a priotity of 10
//		
//		System.out.println(thread2.getPriority());
//		System.out.println(Thread.activeCount());
		
		thread2.setDaemon(true);
		System.out.println(thread2.isDaemon());
		thread2.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

}

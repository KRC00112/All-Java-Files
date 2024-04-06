package practiceThreads;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		int input=5;
		
		
		MyRunnable runnable=new MyRunnable();
		
		runnable.countUp(input);
		
		MyRunnable2 runnable2=new MyRunnable2();
		
		runnable2.countDown(input);


		
		
		
		Thread thread=new Thread(runnable);
		
		Thread thread2=new Thread(runnable2);

		
		
		
		
		
		thread.start();
		
		thread.join(1000);
		
		thread2.start();
		

	}

}

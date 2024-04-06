package practiceThreads;

public class MyRunnable2 implements Runnable {

	
	int x;
	
	public void countDown(int x) {
		
		

		for(int i=x-1;i>0;i--) {
			
			
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		countDown(x);
		
	}

}

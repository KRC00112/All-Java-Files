package practiceThreads;

public class MyRunnable implements Runnable{

	int x;
	
	public void countUp(int x) {
		// TODO Auto-generated method stub
		
//		System.out.println("Loading...");
//
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Beginning Thread...");
//
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		for(int i=1;i<=x;i++) {
			
			
			
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
		
//		System.out.println("Thread has Ended");
		
		
		
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		countUp(x);
		
	}

}

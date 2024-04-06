package lec53_MultiThreadinig;

public class MyThreads extends Thread  {
	
	
//	@override
	
	
	public void run(){
		
		
		for(int i=5;i>0;i--) {
			
			System.out.println("Thread #1:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
//			System.out.println(1/0);

			
			
			
			
		}
		
		
		System.out.println("Thread #1 is finished :3");
		
		
	}
	

}

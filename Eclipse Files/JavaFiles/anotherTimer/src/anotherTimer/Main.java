package anotherTimer;

public class Main implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=5;i>0;i--) {
			
			
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		System.out.println("Happy Birthday John Doe");
		
	}
	
	
	public static void main(String[]args) {
		
		
		
		
		Thread thread=new Thread(new Main()); 
		
		thread.start();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}

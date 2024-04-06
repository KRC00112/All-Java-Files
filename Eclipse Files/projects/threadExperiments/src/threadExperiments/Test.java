package threadExperiments;

public class Test implements Runnable{
	
	
	
	static Test test =new Test();
	
	static Thread thread=new Thread(test);
	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int count=0;

		
		while(count<=10) {
			count();
		
		}
		

	}
	
	
	public static void count() {
		
		thread.start();
		System.out.println("shitty");
		
		
		
	}








	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(i);
			try {
					thread.sleep(1000);;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
		
		
		
		
		
	}

}

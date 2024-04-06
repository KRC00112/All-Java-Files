package roughTest;

import java.util.Random;

public class generateNewNumbers {
	
	public static void main(String[] args) {
		
		
		Random random=new Random();
		
		for(int i=0;i<=10;i++) {
			int x = random.nextInt(5);

			
			System.out.println(x);
			
		}
		
		
	}
	

}

package list;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		
		
			Integer num=12345;
			int remainder=0;
			int reverse=0;
			
			
			do {
				
				remainder=num%10;			
				num=num/10;			
				reverse=(reverse*10)+remainder;
			
			}while(num>0);
			
			
			
			
			
			System.out.println(reverse);
			

		

				



		
		
		
		
	}

}

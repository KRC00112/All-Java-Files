package firstSemProblems;

public class Exam {
	
	public void GCD() {
		

		
		int x=12;
		int y=26;		
		int divisor=1;
		int divisor2=1;
		int b=0;
		int c=0;
		
		while(divisor>0) {
			if(x%divisor==0) {
				
				b=divisor;
				System.out.print(b+" ");

			}
		

		divisor++;
		
		}
		
		System.out.println();
		while(divisor2>0) {
			if(y%divisor2==0) {
				
				c=divisor2;
				System.out.print(c+" ");

			}
		

		divisor2++;
		
		}
		
		
		
		
	}
	
	
}

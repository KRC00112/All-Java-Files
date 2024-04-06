package firstSemProblems;

public class Assignment2 {
	
	
	
	public float summationFloat(Float x) {
		
		
		
		
		String stringNum=String.valueOf(x);
		
		String withZero= stringNum.replace(".", "0");
		
		String[] digits=withZero.split("");
		int z=0;
		
		
		
		for(int i=0;i<digits.length;i++) {
			
					
			int y=Integer.parseInt(digits[i]);
			
			
			z=z+y;
			
		
		}
		System.out.println(z);
		
			
			return z;
		
	}
	
	public int reverseOdd(long x) {
		int y=0;
		
		String stringNum=String.valueOf(x);
		String[] digits=stringNum.split("");
		
		
		for(int i=digits.length-1;i>=0;i--) {
			
			
			
			y=Integer.parseInt(digits[i]);
			
			
			if(y%2==0) {
			
				System.out.print(y);
		
			}
				
		}
		System.out.println();
		return y;
		
	}
	
	public void swapTwoVar(int x,int y) {
		
		System.out.println("first number: "+x);
		System.out.println("first number: "+y);
	
		
		System.out.println("after swap: ");
		
		
		
		System.out.println("first number: "+(x+(y-x)));
		System.out.println("first number: "+(y-(y-x)));

		
		
		
		
	}
	
	
	
	
	
	
	
	

}

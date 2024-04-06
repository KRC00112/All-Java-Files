package romanToInteger;

public class Main {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		String roman="IVXLCDM";
		String roman="CDXL";
		
//		System.out.println(roman.substring(6, 8));
		
	
		
		
		int i;
		int j = 0;
		
		if(roman.length()%2==0) {
		
		for(i=0;i<roman.length();i+=2) {
							
				j=i+2;
				System.out.println(roman.substring(i,j));
				compare(roman.substring(i,j));
				
			
			}
		
		
		}else {
			System.out.println("Will handle for odd number of characters");
		}
			
			
			
			
		}
	
	public static int compare(String s) {
		
		int I=1;
		int V=5;
		int X=10;
		int L=50;
		 int C=100;
		 int D=500;
		int M=1000;
		
		char firstRoman=s.charAt(0);
		char secondRoman=s.charAt(1);
			
		int x=0;
		
		switch(firstRoman) {
		
		case 'C':x=C;break;
		case 'D':x=D;break;
		case 'X':x=X;break;
		case 'L':x=L;break;
		
		}
		
		switch(secondRoman) {
		
		case 'C':x=C;break;
		case 'D':x=D;break;
		case 'X':x=X;break;
		case 'L':x=L;break;
		
		}
		
		
		if(firstRoman<secondRoman) {
			
			System.out.println(secondRoman-firstRoman);
			
		}
		
		
		
		
		
		
		return 0;
		
		
		
		
	}
		
		
		
		
		

	

}

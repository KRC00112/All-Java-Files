package palindrome;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="irradient";
		
		System.out.println(x);
		
		String reversed = "";
		
		int count=0;
		
		boolean isPalindrome=false;
		
		for(int i=x.length()-1;i>=0;i--) {
			
			
			reversed=reversed+x.charAt(i);
			
	
			
		}
		
		System.out.print(reversed);
		System.out.println();
		
		for(int i=0;i<x.length();i++) {
			

			if((x.charAt(i)==reversed.charAt(i))) {
				
				
				isPalindrome=true;
				
				if(isPalindrome==true) {
					count++;
				
				}
				
				
				
				
				
				
			}
			
			
			
			
		}
		
		if(x.length()==count) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
		

		
		
		
		

	}

}

package palindrome;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
		System.out.println(isPalindrome(303));
		
		
		
		

	}
	
	public static boolean isPalindrome(int x) {
		
		
		
		
		
		String numberString=String.valueOf(x);
		
		String reverse = "";
		
		for(int i=numberString.length()-1;i>=0;i--) {
			
			
			 reverse=reverse+numberString.charAt(i);
			
			
			
		}
		
		
		if(!(numberString.equalsIgnoreCase(reverse))) {
		
			return false;
			
			
			
		}
		
		else {
			return true;
		}
		
		
		
		
    
		
		
    }
	

	
	
	
}

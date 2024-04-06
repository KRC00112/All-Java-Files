package palindrome;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String word="lion";
		char a = 0;
		
		String x = null;
		
//		System.out.println(name.length());
//		System.out.println(name.charAt(0));
		
		
		
		
		for(int i=word.length()-1;i>=0;i--) {
			
			 a=word.charAt(i);
			 x=x+a;
			 
			 
			 
			 
			 
			

			

			
		}
		
		String z=x.substring(4);
		
		if(z.equals(word)) {
			
			System.out.println("is a palindrome");
			
		}
		else {
			
			System.out.println(word+" and "+z+" are not palindromes");
		}
		
		
		
		
		

	}

}

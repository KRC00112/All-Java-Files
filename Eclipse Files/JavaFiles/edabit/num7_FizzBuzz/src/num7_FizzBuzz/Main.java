package num7_FizzBuzz;

public class Main {

	public static void main(String[] args) {

		fizzBuzz(5);

		
	}
	
	public static String fizzBuzz(int n) {
		
		String s = null;
		
		if(n%5==0 && n%3==0) {
			System.out.println("FizzBuzz");
		}
		else if(n%3==0) {
			System.out.print("Fizz");
		}
		 else if(n%5==0) {
			System.out.println("Buzz");
		}
		
		
		 else if(n%5!=0 && n%3!=0) {
			  s=Integer.toString(n);
				System.out.println(s);
			}
		
		
		return s;
	  }
	
	

}

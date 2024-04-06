package fibonnaciUsingRecursion;

public class Main {
	
	
	
	
	
	public static long fibonacci(int n) {
		
		
		
		if (n<=1) {
			
			return 1;
			
		}
		
		
		
		return fibonacci(n-1)+fibonacci(n-2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(fibonacci(5));
		
		
		
	}

}

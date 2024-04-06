package exponentsUsingRecursion;

public class Main {
	
	
	public static int power(int m,int n) {
		
		
		
		if(n==0) {
			
			
			return 1;
		}
		
		
		
		return m * power(m,n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(power(4,1));

	}

}

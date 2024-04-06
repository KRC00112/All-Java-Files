package gcdUsingRecursion;

public class Main {
	
	
	public static long gcd(int m,int n) {
		
		
		
		
	
			
		
		
		if(m>n) {
			
		return gcd(m-n,n);
		
		}
		
		if(m<n) {
			
			return gcd(n,n-m);
		}
		
		else {
		
		return m;
		
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println(gcd(35,15));
		
		
	}

}

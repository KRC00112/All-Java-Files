package weirdNorWeird;

import java.util.Scanner;

public class Solution {

	
	 private static final Scanner scanner=new Scanner(System.in);

	
    public static void main(String[] args) {
    	
    	
    	int N=scanner.nextInt();
    	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    	
    	
    	int remainder=N%2;
    			

    	if(remainder!=0) {
    		System.out.println("weird");
    	}
    	else if(remainder==0) {
    		if(N>=2&&N<=5) {
    			System.out.println("Not weird");
    		}
    		
    		else if(N>=6&&N<=20) {
    			System.out.println("weird");
    		}
    		else if(N>20) {
    			System.out.println("Not weird");
    		}
    		
    		
    		
    	}
    	
    	scanner.close();
    	
    	
    }
}

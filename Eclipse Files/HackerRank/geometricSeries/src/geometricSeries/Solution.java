package geometricSeries;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		int t=in.nextInt();
        for(int i=0;i<t;i++){
 
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int product=1;
            int sum=0;
            
            int term=a+1*b;
            System.out.print(term+" ");
            
            for(int j=1;j<n;j++) {
            	
            	product*=2;
            		
            	System.out.print(term+(product*b)+" ");
            	
            	term+=(product*b);

	
            }
            System.out.println("");
        }
        in.close();
	}

}

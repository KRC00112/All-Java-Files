package dataTypes;

import java.util.*;
import java.io.*;
import java.math.BigInteger;



class Solution{
    public static void main(String []argh)
    {

    	long k=2;
    	long n=31;
    	long product=1;
    	
    	long w=63;
    	long product2=1;
    	
    	for(int j=1;j<=n;j++) {
    		
    		product*=k;
//    		System.out.println(product);
    		
    	}
    	
    	for(int l=1;l<=w;l++) {
    		
    		product2*=k;    		
    		//System.out.println(product2);
    		
    	}
//    	System.out.println(-product2); THE program still works as initailly intended irrespective the sign here
    	
    	
    	
    	
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-product && x<=product-1)System.out.println("* int");
                if (x >= -product2 && x <= product2 - 1) System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}




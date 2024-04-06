package stringIntro;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int a=A.length();
        int b=B.length();
        
        System.out.println(a+b);
        if(B.charAt(0)<A.charAt(0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        String A1=A.substring(0,1).toUpperCase();
        String A2=A.substring(1);
        System.out.print(A1+A2+" ");
        
        String B1=B.substring(0,1).toUpperCase();
        String B2=B.substring(1);
        System.out.println(B1+B2);
        
            
                
        
    }
}




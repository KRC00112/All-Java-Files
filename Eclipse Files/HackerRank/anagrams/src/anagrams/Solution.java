package anagrams;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		
		String a="Cxtaaa";
		String b="Cxtaaa";
		
		boolean s = false;
		
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		int count=0;
		
		
		if(a.length()!=b.length()) {
			
			System.out.println("not anagram");
			s=false;
			
			
		}
		
		
		if(a.length()==b.length()) {
		
		for(int i=0;i<a.length();i++) {
			
			
			int x=a.charAt(i);
			
			
			for(int j=0;j<b.length();j++) {
				
				if(x==b.charAt(j)) {
					
					
					
//					System.out.println("is anagram");
					
					
					count++;
					
					
					
				}
				
				
				
			}
			
			
		
			
			
			
		}
		
		if(count==a.length()) {
			
			System.out.println("is anagram");
			
		}
		
		if(count!=a.length()) {
			
			System.out.println("not anagram");
			
		}
		
		
		
		
		
		
		}
		
		
		
    	
    	
    	
    
       
    }
}
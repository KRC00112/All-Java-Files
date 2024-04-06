package anagram;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String w1="kanani";
		String w2="sky";
		int nom=0;
		
	

		
		
		
		if(w1.length()!=w2.length()) {
			System.out.println("not an anagram");
			
		}
		
		else if(w1.length()==w2.length()) {
		
		for(int i=0;i<w1.length();i++) {
			
			char prime=w1.charAt(i);
			
			for(int j=0;j<w2.length();j++) {
				
				if(w2.charAt(j)==prime) {
					nom++;
				}
				else if(w2.charAt(j)!=prime) {
					
					
				}
				
			}

			
			
	
		}
		
		RepeatingLetters number1=new RepeatingLetters();
		RepeatingLetters number2=new RepeatingLetters();
		int x=number1.countRepeatedLetters(w1);
		int y=number2.countRepeatedLetters(w2);

		
		if(x==y) {
			nom=nom-x;
		}
		
		
		if(nom==w1.length()&&nom==w2.length()) {
			
			System.out.println("is anagram");
			
		}
		}
		
		
		
		
		
		
		
		
	

	}

}

package wordGuesser;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random=new Random();
		Scanner scanner=new Scanner(System.in);
		
		String[] words= {"noodles","rice","biscuits","eggplant"};
		int i=random.nextInt(0,4);
		
		String wordToGuess=words[i];
		
		int len=wordToGuess.length();
		
		char k = 0;
		System.out.println(wordToGuess);
		int x=0;
		char l = 0;
		String h = null;
		
		String store="";
		while(true) {
			
			Character guessALetter=scanner.next().charAt(0);
		
		
			for(int j=0;j<wordToGuess.length();j++) {
				
				
				k=wordToGuess.charAt(j);
				l=k;
				
				k='+';
				
				if(guessALetter.equals(l)) {
					
					
					k=guessALetter;
					
					
				}

			
				
				 h=k+" ";

				 
				 System.out.print(h);

				 
				
			}
			


			System.out.println();
			
			
			
			
			
			
		
		}
		
		
		
		
		
		
		
		
		
	}

}

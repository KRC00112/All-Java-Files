package pigLatin_words;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		
		
		System.out.print("Enter word: ");
		String word=scanner.nextLine();
		
		
		String piglatin=word.substring(1)+word.charAt(0);
		
		System.out.println("the pig latin word is: "+piglatin+"ay");
		
		
		
		
	}

}

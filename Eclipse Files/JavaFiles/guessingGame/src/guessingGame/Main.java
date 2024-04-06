package guessingGame;


import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner scanner =new Scanner(System.in);
		
		Random random=new Random();
		int number=random.nextInt(100)+1;
		
		System.out.print("Enter your guess: ");
		int guess=scanner.nextInt();

			while(number!=guess) {
			if(number<guess) {
				System.out.println("your guess was too high");
			}
			else if(number>guess) {
				System.out.println("your guess was too low");
			}
	
				System.out.print("Enter your guess: ");
				 guess=scanner.nextInt();
				
			}
	
		System.out.println("Congrats!You found the number: "+guess);
		
	}

}
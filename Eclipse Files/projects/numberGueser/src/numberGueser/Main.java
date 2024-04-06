package numberGueser;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[]args) {
		
		Scanner scanner=new Scanner(System.in);
		
		Random random=new Random();
		int num=random.nextInt(1,101);
//		System.out.println(num);
		
		
		int not=0;
		int setTries=5;
		int guess = 0;
		
	for(not=0;not<setTries;not++) {
		
		do {
		
			System.out.print("Enter number: ");
			guess=scanner.nextInt();
	
			if(guess==num) {
				
				System.out.println("correct! The number is "+num);
				break;
	
			}
			else if(guess>num) {
				System.out.println("You went higher.");
				System.out.println();
				System.out.println((setTries-1)-not+" tries remaining.");
				System.out.println();
				break;
				
			}
			else if(guess<num) {
				System.out.println("you went lower");
				System.out.println();
				System.out.println((setTries-1)-not+" tries remaining.");
				System.out.println();
				break;
			}
		
		}while(true);
		
		if(guess==num) 
		{
			break;
			
		}
		
	}
	if(guess!=num) {
		
		System.out.println("try again next time.");
		System.out.println("the number was "+num);
		}
	}		
}



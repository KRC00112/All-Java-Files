package loop_question_10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String decision;
		
		do {
			
			Scanner scanner=new Scanner(System.in);
			
			
			
			System.out.print("enter number one: ");
			int x=scanner.nextInt();
			
			System.out.print("enter number two: ");
			int y=scanner.nextInt();
			System.out.println();
			
			scanner.nextLine();
			
			System.out.println("Do you want to do that again?(Y/n) ");
			decision=scanner.nextLine();
			
			

		}while(decision.equalsIgnoreCase("y"));
		
		System.out.println("Exit");
		
		
		
	}

}

package loop_question_7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner scanner=new Scanner(System.in);
		String choice;
		int x;
		
		 
		
			do {
			System.out.print("Enter the number: ");
			x=scanner.nextInt();
			scanner.nextLine();
			System.out.print("Do you want to continue?(Y/n): ");
			choice=scanner.nextLine();
			
			}while(choice.equalsIgnoreCase("y"));
			
		
		
			if(choice.equalsIgnoreCase("n")) {
				
				if(x%2==0) {
				
				System.out.println("Even:");
				x++;
				
				}
				System.out.println("odd:"+x);
				
				
			}
			
		
		
		
		

		
		
	}

}

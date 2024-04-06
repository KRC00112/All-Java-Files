package loop_question_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter a positive number: ");
			int num=scanner.nextInt();
		
			if(num>0) {
				
				for(int i=1;i<=10;i++) {
					
					
					System.out.println(num+"x"+i+"="+(num*i));
					
					
				}
			
			}
			
			
			else {
				System.out.println("Enter a valid number");
			}
	}

}

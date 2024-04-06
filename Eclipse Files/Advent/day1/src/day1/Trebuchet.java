package day1;

import java.util.Scanner;

public class Trebuchet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		


		Scanner scanner=new Scanner(System.in);
		System.out.print("Size of the basket: ");
		int size=scanner.nextInt();
		scanner.nextLine();
		String[] basket=new String[size];
		
		
		System.out.println("List the fruits: ");
		for(int i=0;i<basket.length;i++) {
			
			
			String fruits=scanner.nextLine();
			
		
			basket[i]=fruits;
			
		}
		
		System.out.println("your list:");
		
		for(int i=0;i<basket.length;i++) {
			
			
			System.out.println(basket[i]);
			
			
		}
		
		
		
		
				
			
		
		
		
		

	}

}

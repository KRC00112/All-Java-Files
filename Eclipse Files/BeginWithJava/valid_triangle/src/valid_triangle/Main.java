package valid_triangle;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter three angles: ");

		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();
		
		if(num1+num2+num3==180) {
			
			System.out.println("the angles are of a triangle");
			
		}
		
		else {
			
			System.out.println("not a triangle");
		}
		
	}
}

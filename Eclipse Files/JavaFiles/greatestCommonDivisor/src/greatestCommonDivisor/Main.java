package greatestCommonDivisor;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		
		Scanner scanner=new Scanner(System.in);
		
		
		
		System.out.print("Enter first number: ");
		int num1=scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Enter second number: ");
		int num2=scanner.nextInt();
		scanner.nextLine();
		
		//using Euclidean Algorithm
		
		while(num1!=num2) {
			
			if(num1>num2) {
				
				num1=num1-num2;

		
			}
			
			if(num2>num1) {
				
				num2=num2-num1;
				
				
				
			}
		}
		
		if(num2==num1) {
			System.out.println("GCD is "+num1);
		}
	}

}

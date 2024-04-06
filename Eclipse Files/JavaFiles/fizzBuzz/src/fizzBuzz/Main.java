package fizzBuzz;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter limit: ");
		int input=scanner.nextInt();
		
		for(int i=1;i<=input;i++) {
			
			if((i%5==0)||(i%3==0)) {
				if(i%5==0) {
					
					System.out.print("Fizz");	
				}
				if(i%3==0) {
					System.out.print("Buzz");	
				}	
				System.out.println();
			}

			else if((i%5!=0)&&(i%3!=0)) {
				System.out.println(i);
			}
		}	

	}

}

package lec09_ifstatements;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter age: ");
		int age=scanner.nextInt();
		
		if(age<13&&age>=1) {
			System.out.println("You are only a child ");	
			
		}
		else if(age<1) {
			System.out.println("not even born yet");
		}
		else if(age>=13&&age<18) {
			System.out.println("you are a teenager");
			
			
		}
		else {
			System.out.println("You are an adult");
		}
	
	}

}

package lec04_userinput;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name=scanner.nextLine();
		System.out.println("Hello "+name);
		
		System.out.print("Enter Age: ");
		int age=scanner.nextInt();
		System.out.println("you are "+age+" years old");
		
		//be careful of using nextline after nextint or anything that isnt nextline
		scanner.nextLine();
		
		System.out.print("Favourite food: ");
		String food=scanner.nextLine();
		System.out.println("Your favourite food is : "+food);
		
		
		

	}

}

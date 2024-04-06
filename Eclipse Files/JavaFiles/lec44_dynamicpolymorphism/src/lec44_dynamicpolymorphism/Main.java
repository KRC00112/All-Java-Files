package lec44_dynamicpolymorphism;

import java.util.*;
public class Main {

	public static void main(String[] args) {

		
		// polymorphism = many shapes/forms
		// dynamic = after compilation (during runtime)
		// ex. A corvette is a: corvette, and a car, and a vehicle, and an object
	
		Scanner scanner=new Scanner(System.in);
		
		Animal animal;
		
		System.out.print("What animal do ypu want? ");
		
		System.out.println("1=dog ,2=cat :");
		int choice=scanner.nextInt();
		
		if(choice==1) {
			
			animal=new Dog();
			animal.speaks();
			
			
		}
		else if(choice==2) {
			
			animal=new Cat();
			animal.speaks();
			
			
		}
		else {
			animal=new Animal();
			System.out.println("Invalid choice");
		}
	
	
	
	}

}

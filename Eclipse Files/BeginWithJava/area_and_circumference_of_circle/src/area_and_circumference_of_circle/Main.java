package area_and_circumference_of_circle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		int radius=scanner.nextInt();
		
		System.out.println("Circumfernce of the circle: "+2*Math.PI*radius);
		System.out.println("Area of the circle: "+Math.PI*radius*radius);
		
		
	}

}

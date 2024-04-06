package lec07_mathfunctions;


import java.util.Scanner;

public class Pythogorean {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Perpendicular : ");
		double per=scanner.nextDouble();
		
		System.out.print("base: ");
		double base=scanner.nextDouble();
		
		
		double sqs=per*per+base*base;
		double sqrt=Math.sqrt(sqs);
		
		System.out.println("The Hypotenuse of the triangle: "+sqrt);
		
		
		
		

	
	
	}

}

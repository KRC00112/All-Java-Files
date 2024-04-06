package area_of_triangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter measure of side a: ");
		double a=scanner.nextInt();
		
		System.out.print("Enter measure of side b: ");
		double b=scanner.nextInt();
		
		System.out.print("Enter measure of side c: ");
		double c=scanner.nextInt();
		
		double s=(a+b+c)/2;
		
		double product=s*(s-a)*(s-b)*(s-c);
		
		System.out.println("the area of the triangle is :"+Math.sqrt(product));
		
		
	}

}

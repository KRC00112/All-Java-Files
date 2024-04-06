package lec07_mathfunctions;

import java.util.Scanner;

public class Herons {
	public static void main(String[]args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("length of x: ");
		double x=scanner.nextInt();
		
		System.out.print("length of y: ");
		double y=scanner.nextInt();
		
		System.out.print("length of z: ");
		double z=scanner.nextInt();
		
		double s=(x+y+z)/2;
		
		double product=(s*(s-x)*(s-y)*(s-z));
		
		double area =Math.sqrt(product);
		
		System.out.println("half of the perimeter of the triangle: "+s);
		System.out.println("Area of the triangle: "+area);
		
		
		
		
		
		
	}

}

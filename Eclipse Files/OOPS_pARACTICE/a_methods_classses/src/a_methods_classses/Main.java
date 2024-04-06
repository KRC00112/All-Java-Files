package a_methods_classses;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("num1: ");
		int num1=scanner.nextInt();
		
		System.out.print("num2: ");
		int num2=scanner.nextInt();
		
		
		int add=add(num1,num2);
		int subtract=subtract(num1,num2);
		int multiply=multiply(num1,num2);
		double divide=divide(num1,num2);
		
		
		System.out.println("num1: "+num1);
		System.out.println("num1: "+num2);
		System.out.println("add: "+add);
		System.out.println("subtract: "+multiply);
		System.out.println("multiply: "+subtract);
		System.out.println("divide: "+divide);

		
	
	
	
	}
	
	
	static int add(int num1,int num2) {
		
		return num1+num2;
	}
	
	static int subtract(int num1,int num2) {
		
		
		return num1-num2;
	}
	static int multiply(int num1,int num2) {
		
		return num1*num2;
	}
	static double divide(int num1,int num2) {
		
		if(num2==0) {
			throw new IllegalArgumentException("mistake");
		}
		
		return  (double)num1/num2;
	}
	
	
	
	
	
	
	
	
	
}



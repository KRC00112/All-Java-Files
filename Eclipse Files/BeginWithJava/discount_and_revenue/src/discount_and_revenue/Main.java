package discount_and_revenue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter product price: ");
		int product=scanner.nextInt();
		
		System.out.print("Enter quantity : ");
		int quantity=scanner.nextInt();
		
		int revenue=product*quantity;
		
		
		
		if(revenue>5000) {
			
			double newProduct=(product-(0.1*product));
			
			System.out.println("discount: "+(0.1*revenue));
			System.out.print("net revenue: "+(newProduct*quantity));
			
		}
		
		else {
			
			System.out.println("see you next time!");
		}
		
		
		
	}

}

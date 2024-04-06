package positive_negative_zero;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=scanner.nextInt();
		
		if(num<0) {
			System.out.println("negative");
		}
		else if(num==0) {
			System.out.println("zero");
		}
		else {
			System.out.println("positive");
		}
		
		
		
		
	}

}

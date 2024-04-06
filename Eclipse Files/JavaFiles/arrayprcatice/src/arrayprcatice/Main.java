package arrayprcatice;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		
		int size=scanner.nextInt();
		
		int[] numbers=new int[size];
		
		
		System.out.print("Enter the elements one by one: ");
		
		for(int i=0;i<size;i++) {
			
			numbers[i]=scanner.nextInt();	
		}
		
		
		int max=numbers[0];
		
		for(int i=1;i<size;i++) {
			if
			(max<numbers[i]) {
			max=numbers[i];
			}
			
			
			
		}
		
		
		System.out.println(max);
		
	}

}

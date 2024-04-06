package firstSemProblems;

import java.util.*;

public class Assignment3 {
	
	

	
	
	public void Choices(int x,int y,int z) {
		
		
		
		System.out.println("Type 1 for (a+b)");
		System.out.println("Type 2 for (a-b)");
		System.out.println("Type 3 for (a*b)");
		System.out.println("Type 4 for (a/b)");
		System.out.println("Type 5 for exit");
		
		
	
		switch(z) {
		
		
		case 1:
			
			if(y>x) {
				System.out.println(x+y);
			}
			else{
				System.out.println("invalid input");
			}
			
			break;

			
		case 2:
			if(x>y) {
				System.out.println(x-y);
			}
			else{
				System.out.println("invalid input");
			}
			
			break;

			
		case 3:
			if(x%7==0 && y%5==0) {
				System.out.println(x*y);
			}
			else{
				System.out.println("invalid input");
			}
			
			break;

			
		case 4:
			if(y!=0) {
				System.out.println(x/y);
			}
			else{
				System.out.println("invalid input");
			}
			
			break;

			
		default:
			break;

	
		}
		
		
		
		
	}
	
	
	
	
	public void addArray() {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("set size: ");
		int n = scanner.nextInt();
		
		int[] array=new int[n];
		
		for(int i=0;i<array.length;i++) {
			
			System.out.print("Enter num "+(i+1)+": ");
			int y = scanner.nextInt();
			
			array[i]=y;
			
			
			
					
			
		}
		
		
		System.out.print("The array: ");
		System.out.print("[ ");
		for(int i=0;i<array.length;i++) {
			
			String p=String.valueOf(array[i]+" ");
//			p=p.replace(, "");
			
			
			System.out.print(p);
			
			
			
		}
		System.out.print("]");
		
		System.out.println();
		
		
		
		int x=0;
		int y=0;

		for(int i=0;i<array.length;i++) {
			
//			System.out.print(array[i]+" ");
			
			if(array[i]%2==0) {
				
				x=x+array[i];
				
		
			}
			
			if(!(array[i]%2==0)) {
				y=y+array[i];

				
			}
			
			
		}
		

		
		System.out.println("Even sum: "+x);
		System.out.println("odd sum: "+y);
		System.out.println("Sum of odd numbers + sum of even numbers = "+(x+y));

		
		
		
	}
	
	
	public void countArray() {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("set size: ");
		int size=scanner.nextInt();
		
		int[] array=new int[size];
		
		
		for(int i=0;i<array.length;i++) {
			
			System.out.print("Enter num "+(i+1)+": ");
			int num=scanner.nextInt();
			
			array[i]=num;
			
			
		}
		
		
		
		System.out.print("The array: ");
		System.out.print("[ ");
		for(int i=0;i<array.length;i++) {
			
			String p=String.valueOf(array[i]+" ");
//			p=p.replace(, "");
			
			
			System.out.print(p);
			
			
			
		}
		System.out.print("]");
		
		System.out.println();
		
		
		

		
		
		
	
		
		
	}
	
	public void TwoArrays() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Set size of array 1: ");
		int size1=scanner.nextInt();
		int[] arr1=new int[size1];
		
		
		for(int i=0;i<arr1.length;i++) {
			
			System.out.print("Enter num "+(i+1)+" of array 1: ");
			int nums=scanner.nextInt();
			
			arr1[i]=nums;
			
			
			
		}
		
		System.out.print("First array: |");
		for(int i=0;i<arr1.length;i++) {
			
			System.out.print(String.valueOf(arr1[i]+"|" ));
			
			
			
			
		}
		
		System.out.println();
		
		System.out.print("Second array: |");
		for(int i=arr1.length-1;i>=0;i--) {
			
			System.out.print(String.valueOf(arr1[i]+"|" ));
			
			
		}
		

		
		
		
		
		
		
		
		
		
	}

	
	
	
	
}



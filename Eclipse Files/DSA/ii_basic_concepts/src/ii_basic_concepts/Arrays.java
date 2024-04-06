package ii_basic_concepts;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] b= {2,4,6,8,10};
		
		
//		System.out.println(4*b.length+"\n"); //because of size of int is 4 bytes
//		
//		
//		
//		for(int i=0;i<b.length;i++) {
//			
//			System.out.println(b[i]);
//			
//			
//		}
		

//		for (int  j:b) {
//			System.out.println(j);
//		}
//		
//		Scanner scanner=new Scanner(System.in);
//		
//		
//		System.out.print("Enter the size of the array: ");
//		int size=scanner.nextInt();
//		
//		int[] a=new int[size];
//		
//		
//		for(int i=0;i<a.length;i++) {
//			
//			System.out.print("Enter "+(i+1)+"th element:" );
//			int num=scanner.nextInt();
//			
//			a[i]=num;
//			
//		}
//		
//		
//		System.out.println("Elements in the array: ");
//		
//		
//		for(int i=0;i<a.length;i++) {
//			
//			System.out.println(a[i]);
//			
//			
//		}
//		
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter basket size: ");
		int size=scanner.nextInt();

		String[] basket=new String[size];
		
		
		System.out.println("Enter ingredients:");
		
		
		
		scanner.nextLine();
		
		for(int i=0;i<basket.length;i++) {
			
			basket[i]=scanner.nextLine();
			
			
			
		}
		
		System.out.println("Your List: ");
		
		for(String i:basket) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		

	}

}

package rough_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PickupArray {
	
	public static void main(String[]args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		
		int invSize=7;
		
		String inventory[]= {"hail","rock"};
		
	
		System.out.println("inventory: "+Arrays.toString(inventory));
		
		
//		showInventory(inventory);
		System.out.println();
		
		
		String item1="flask";
		String item2="sword";
		String item3="feather";
		
		String[] table=new String[3];
		
		
		table[0]=item1;
		table[1]=item2;
		table[2]=item3;
		
		
		
		
		
		
		
		
		System.out.println("You come across 3 items on your way to the stone chamber:");
		for(int i=0;i<table.length;i++) {
			
			
			System.out.println((i+1)+"."+table[i]);
			
			
			
			
			
			
		}
		
		ArrayList<Integer> newInventory=new ArrayList <Integer>();
		
		System.out.println("pick up one(1,2 or 3):");
		int choice=scanner.nextInt();
		
		String item;
		
		switch(choice) {
		
		case 1: 
			item=table[0];  
				System.out.println(item);
				newInventory.add(0);
			break;
		case 2: item=table[1]; 
				System.out.println(item);
				inventory[inventory.length]=item;
			break;
		case 3: item=table[2]; 
				System.out.println(item);
				inventory[inventory.length]=item;
			break;
		
		}
		
		inventory=newInventory.toArray(inventory);
		
		System.out.println("inventory: "+Arrays.toString(inventory));

		
		
		
		
		
		
	}
	
	
	public static void showInventory(String[] inventory) {
		
		
		for(int i=0;i<inventory.length;i++) {
			
			
			System.out.println(inventory[i]);
			
			
			
			
		}
		
		
		
	}
	
	
	

}

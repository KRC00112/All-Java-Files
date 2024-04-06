package tbasedRPG;
import java.util.Scanner;


public class Main {
	
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		
		
		
		
		System.out.println("you can go north(1),south(2),east(3) and west(4):");
		System.out.println("where do you go?");
		int compass=scanner.nextInt();
	
		switch(compass) {
		
		case 1  :{
					System.out.println("you go north.");
					System.out.println("you see the gate to Greymoor castle.");
					System.out.println("can't open it.");
					break;
				}
		case 2  :{
					System.out.println("you go south.");
					System.out.println("You see the shephard boy herding the ship");
					break;
				}
		case 3  :{
					System.out.println("you go east.");
					System.out.println("you enter the marketplace.");
					
					break;
				}
		case 4  :{
					System.out.println("you go west.");
					System.out.println("you give up(exit).");
					break;
				}

		}
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

}

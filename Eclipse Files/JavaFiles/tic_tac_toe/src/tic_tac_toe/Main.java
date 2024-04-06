package tic_tac_toe;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		String[][] grid=new String[3][3];
		Random random=new Random();
		

		
		int input;
		
		grid[0][0]="1";
		grid[0][1]="2";
		grid[0][2]="3";
		grid[1][0]="4";
		grid[1][1]="5";
		grid[1][2]="6";
		grid[2][0]="7";
		grid[2][1]="8";
		grid[2][2]="9";
		
		
		System.out.println();
		
		while(true) {
		
		System.out.println("          |         |");
		
		for(int i=0;i<grid.length;i++) {
			
			
			
			for(int j=0;j<grid.length;j++) {
				
				
				
			
					
					
					System.out.print("     "+grid[i][j]+"    ");
				
				
				
			}
			
			if(i<2) {
				System.out.println(" \n  --------|---------|--------");
				
				
			}
			
			
		}
		System.out.println("\n          |         |");
		
		
		System.out.print("\nEnter where (1-9) you want to put your input (X): ");
		input=scanner.nextInt();
		System.out.println();
		
		switch(input) {
		
		
			case 1: grid[0][0]="X";
				break;
				
			case 2: grid[0][1]="X";
				break;
				
			case 3: grid[0][2]="X";
				break;
	
			case 4: grid[1][0]="X";
				break;
	
			case 5: grid[1][1]="X";
				break;
	
			case 6: grid[1][2]="X";
				break;
	
			case 7: grid[2][0]="X";
				break;
	
			case 8: grid[2][1]="X";
				break;
	
			case 9: grid[2][2]="X";
				break;

		}
		
		
		
		int irand=random.nextInt(3);
		int jrand=random.nextInt(3);
		if(!(grid[irand][jrand].equals("O"))||!(grid[irand][jrand].equals("X"))) {
			
			
			grid[irand][jrand]="O";
			
		}
		
		
		
		
		
		
		
		}


		
		

	}

}

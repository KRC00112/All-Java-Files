import java.util.Scanner;


public class lec15_nestedloops{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter no. of rows: ");
		int rows=scanner.nextInt();
		System.out.println("Enter no. of columns: ");
		int columns=scanner.nextInt();
		System.out.println("Enter symbol: ");
		char symbol=scanner.next().charAt(0);
		
		
			for(int i=1;i<=rows;i++){
				System.out.println("");
			
			
			for(int j=1;j<=columns;j++){
				System.out.print(symbol);
			}
		
		
		
		}
		
		
	
	}



}

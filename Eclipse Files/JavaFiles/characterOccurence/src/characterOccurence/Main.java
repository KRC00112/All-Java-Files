package characterOccurence;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter String: ");
		String word=scanner.nextLine();
		
		System.out.print("Enter letter: ");
		char letter=scanner.next().charAt(0);
		
		int n=0;
		
		for(int i=0;i<word.length();i++) {
			
			if(word.charAt(i)==letter) {
				
				n++;
				
			}
			
			
			
		}
		System.out.println("number of occurences of \""+letter+"\" in \""+word+"\" is: "+n);
		

	}

}

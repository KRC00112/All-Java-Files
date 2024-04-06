package vowelsConsonants;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter string: ");
		String word=scanner.nextLine();

		int nov=0;
		int con=0;
		
		
		for(int i=0;i<word.length();i++) {
			
			

			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') {
				
				nov++;
			
			}
			else {
				
				con++;			
			}

	
		}
		System.out.println("No of vowels:"+nov);
		System.out.println("no of consonants:"+con);

		
	}

}

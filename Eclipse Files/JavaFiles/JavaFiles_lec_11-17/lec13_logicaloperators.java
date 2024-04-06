import java.util.Scanner;


public class logicaloperators{

public static void main(String[] args){
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("WHat is the temperature?:");
		int age=scanner.nextInt();
		
		if(!(age<0||age>40)){
		System.out.println("stay home.please.");
		}
		
		else{
		System.out.println("okay weather.");
		}
	
	}
	
	
	
	
	
	
	



}

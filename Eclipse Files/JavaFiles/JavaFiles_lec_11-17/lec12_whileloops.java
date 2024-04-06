import java.util.*;


public class whileloops{


public static void main(String[] args){
	
		
		String name;
		do{
			
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("What is your name?: ");
			name=scanner.nextLine();
			
		}while(name.isBlank());
		
	
	
	System.out.println("Hello "+name);
	
	}

}





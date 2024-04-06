import java.util.Scanner;

public class switchcase{
	public static void main(String[]args){
	
		Scanner scanner=new Scanner(System.in);
		System.out.print("What day is it?: ");
		String day=scanner.nextLine();
		
		switch(day){
		
		
		case("Sunday"):
			System.out.println("It is Sunday");
			break;
		
		case("Monday"):
			System.out.println("Is is Monday");
			break;
		
		case("Tuesday"):
			System.out.println("Is is Tuesday");
			break;
			
		case("Wednesday"):
			System.out.println("Is is Wednesday");
			break;
		
		case("Thursday"):
			System.out.println("Is is Thursday");
			break;
		
		case("Friday"):
			System.out.println("Is is Friday");
			break;
		
		case("Saturday"):
			System.out.println("Is is Saturday");
			break;
			
		default:
			System.out.println("not a day");
			break;
		
		
	
	
	
		
		}
	
	
	}






}

package num2_areTheNumbersEqual;

public class Main {

	public static void main(String[] args) {

	
		
		isEqual(1,10);
		
		
		
		
	}
	
	static boolean isEqual(int num1,int num2) {
		
		boolean choice=true;
		
		if(num1==num2) {
			System.out.println(choice);
		}
		
		else if(num1!=num2) {
			choice=false;
			System.out.println(choice);
			
		}
		
		return choice;
		
		
	
	}
	

}

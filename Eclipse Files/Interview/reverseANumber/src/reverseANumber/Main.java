package reverseANumber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x=123;
		
		String l=String.valueOf(x);
		
		int reversedNumber = 0;
		
		String[] numbers=l.split("");
		
		
		for(int i=numbers.length-1;i>=0;i--) {
			
			
			reversedNumber=reversedNumber*10+Integer.parseInt(numbers[i]);
			
			
		}
		
		System.out.print(reversedNumber);

		
		
		
		
		
		

	}

}

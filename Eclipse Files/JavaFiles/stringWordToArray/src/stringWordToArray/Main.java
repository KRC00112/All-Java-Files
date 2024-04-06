package stringWordToArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String text="Hello world how are you ";
		
		String delimeter=" ";
		
		String[] splitted=text.split(delimeter);
		
		for(int i=0;i<splitted.length;i++) {
			
			System.out.println(splitted[i]);
			
		}
		
		
		

	}

}

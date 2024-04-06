package altCaps;

public class Main {

	public static void main(String[] args) {
		
	
		String text="kaustav raj chakraborty";
		
		altCaps(text);
	
		}
	
	static void altCaps(String text) {
		
		
		for(int i=0;i<text.length();i++) {
			
			
			if(i%2!=0) {
				System.out.print(text.charAt(i));
			
		}
			
			else if(i%2==0) {
				System.out.print(text.toUpperCase().charAt(i));
			
		}
		
		
	}
	
	
	
	
		
}


}
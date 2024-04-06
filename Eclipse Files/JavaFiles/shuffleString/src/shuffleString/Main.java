package shuffleString;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random=new Random();
		
		String word="doraemon";
		int count=0;
		
		
		String[] letters=word.split("");
		
		
		
		for(int i=0;i<letters.length;i++) {
			
			int index=random.nextInt(word.length());

			System.out.println(letters[index]);
			
			
			
		}
	
		
		
		
		
		

	}

}

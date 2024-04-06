package checkpoint_one;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> numbers=new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(5);
		numbers.add(9);
		numbers.set(1, 9);
		
		
		for(int i=0;i<numbers.size();i--) {
			
			System.out.println(numbers.get(i));
			
			
			
		}
	
		
		
		
		
		
	}

}

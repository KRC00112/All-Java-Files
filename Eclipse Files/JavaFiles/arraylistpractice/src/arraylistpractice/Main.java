package arraylistpractice;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> numbers=new ArrayList<String>();
		numbers.add("cat");
		numbers.add("mat");
		numbers.add("sat");
		numbers.add("rat");
		numbers.add("fat");
		
		for(int i=0;i<numbers.size();i++) {
			
			System.out.println(numbers.get(i));
			
		}
		System.out.println("----------------------------------");
		numbers.remove(2);
		for(int i=0;i<numbers.size();i++) {
			
			System.out.println(numbers.get(i));
			
		}

		numbers.set(0, "nice");
		
		System.out.println("----------------------------------");
		for(int i=0;i<numbers.size();i++) {
			
			System.out.println(numbers.get(i));
			
		}
		
		
		
		
		
		
	}

}

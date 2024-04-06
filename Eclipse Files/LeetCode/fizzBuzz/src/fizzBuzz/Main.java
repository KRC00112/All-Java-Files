package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		System.out.println(fizzBuzz(33));
		
		

	}
	
	public static List<String> fizzBuzz(int n) {
		
		List<String> list=new ArrayList<String>();
		
		for(int i=1;i<=n;i++) {
		
			String fizzBuzz=String.valueOf(i);
			
			
			if(i%3==0) {
				
				list.add(fizzBuzz);
			}
			if(i%5==0) {
				
				list.add(fizzBuzz);
			}
			if(i%5==0 && i%3==0) {
				list.add(fizzBuzz);
			}
			if(i%5!=0 || i%3!=0) {
				list.add(fizzBuzz);
			}
			
			
			
		}
		
		
		
		return list;
        
    }

}

package lec22_foreachloop;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		
		//String[] animals=new String[4];
		ArrayList <String> animals=new ArrayList <String>();
		animals.add("rhino");
		animals.add("horse");
		animals.add("zebra");
		animals.add("squirrel");
		
//		animals[0]="cat";
//		animals[1]="dog";
//		animals[2]="parrot";
//		animals[3]="lion";
		
		
		for(String i : animals) {
			
			System.out.println(i);
			
			
			
		}
		
		
		
		
		
	}

}

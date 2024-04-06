package lec08_randomvalues;

import java.util.Random;


public class Main {

	public static void main(String[] args) {

		Random random=new Random();
		
		int x= random.nextInt(1,7);//random.nextInt(6)+1
		
		boolean y=random.nextBoolean();
		
		System.out.println(x);
		
		System.out.println(y);

	}

}

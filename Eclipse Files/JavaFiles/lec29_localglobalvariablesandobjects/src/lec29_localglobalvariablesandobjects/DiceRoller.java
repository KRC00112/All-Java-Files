package lec29_localglobalvariablesandobjects;

import java.util.Random;

public class DiceRoller {
	//global declaration
	//Random random;
	//int number=0; instead of down there
	DiceRoller(){
		
	Random random=new Random();//random=new Random();
	int number=0;
	roll(random,number);//remove values inside
		
		
	}
	
	
	void roll(Random random,int number)//remove values inside 
	{
		
		
		number=random.nextInt(6)+1;
		System.out.println(number);
		
		
	}

}

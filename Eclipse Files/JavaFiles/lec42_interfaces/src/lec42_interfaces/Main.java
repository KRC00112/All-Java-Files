package lec42_interfaces;

public class Main {

	public static void main(String[] args) {
			
		
			// interface = a template that can be applied to a class.
			//				similar to inheritance, but specifies what a class has/must do.
			//				classes can apply more than one interface, inheritance is limited to 1 super class
		
	Rabbit rabbit=new Rabbit();
	Hawk hawk=new Hawk();
	Fish fish =new Fish();
	
	
	hawk.hunts();
	rabbit.flee();
	
	fish.hunts();
	fish.flee();
	
		
		
	}

}

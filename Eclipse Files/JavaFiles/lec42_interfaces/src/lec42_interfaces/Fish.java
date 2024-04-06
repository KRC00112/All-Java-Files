package lec42_interfaces;

public class Fish implements Prey,Predator{

	@Override
	public void hunts() {

		System.out.println("Fish Hunt microbes and small sea creatures");
		
	}

	@Override
	public void flee() {

		System.out.println("Gets eaten by bigger predators");
		
		
	}

}

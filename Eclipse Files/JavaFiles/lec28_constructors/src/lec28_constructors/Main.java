package lec28_constructors;

public class Main {

	public static void main(String[] args) {

		//constructor=special method that is called when an object is instantiated(Created)
		
		Human human1=new Human("Rick",65,70.82);
		Human human2=new Human("Morty",15,52);
		System.out.println(human2.name);
		
		human2.eat();
		
		human1.drink();

		
		
	}

}

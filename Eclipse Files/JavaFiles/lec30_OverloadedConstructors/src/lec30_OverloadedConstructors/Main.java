package lec30_OverloadedConstructors;

public class Main {

	public static void main(String[] args) {
		
		// overloaded constructors = multiple constructors within a class with the same name,
		// 							 but have different parameters
		// 							 name + parameters = signature
		
		
		Pizza pizza=new Pizza("Olive","garlic");
		
		System.out.println(pizza.bread);
		System.out.println(pizza.Sauce);
		System.out.println(pizza.toppings);
		System.out.println(pizza);
		
		
	}

}

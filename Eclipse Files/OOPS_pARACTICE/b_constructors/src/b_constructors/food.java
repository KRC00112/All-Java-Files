package b_constructors;

public class food {
	
	String name;
	int price;
	
	food(String name,int orice){
		
		
		this.name=name;
		price=orice;
		
		
	}
	
	static void taste(String name) {
		
		System.out.println(name+" is very tasty");
	}
	static void price(int price) {
		
		System.out.println(price+" is very tasty");
	}
	
	
	

}

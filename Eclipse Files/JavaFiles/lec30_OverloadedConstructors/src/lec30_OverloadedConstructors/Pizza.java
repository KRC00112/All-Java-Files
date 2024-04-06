package lec30_OverloadedConstructors;

public  class Pizza {
	
	
	String toppings;
	String bread;
	String Sauce;
	
	Pizza(String toppings,String bread,String Sauce){
		
		this.bread=bread;
		this.toppings=toppings;
		this.Sauce=Sauce;
		
		
		

	}
	Pizza(String toppings,String bread){
		
		this.bread=bread;
		this.toppings=toppings;
		
		
		
		

	}
	
	
	
	

}

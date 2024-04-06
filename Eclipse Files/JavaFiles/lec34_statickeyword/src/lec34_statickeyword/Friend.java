package lec34_statickeyword;

public class Friend {
	
	 String name;
	static int nof;
	
	
	Friend(String name) {
		this.name=name;
		nof++;
		
	}

	
	static void displayfriends() {
		
		System.out.println("You have "+nof+" friends");
		
		
	}
	
	
}

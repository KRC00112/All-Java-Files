package constructor_practice;

public class Book {
	
	
	String title;
	String author;
	int pubyear;
	String isbn;
	
	
	Book(String title,String author,int pubyear,String isbn){
		
		this.title=title;
		this.author=author;
		this.pubyear=pubyear;
		this.isbn=isbn;

	}
	
	void details() {
		
		System.out.println("Title : ["+this.title+"]");
		System.out.println("Author : ["+this.author+"]");
		System.out.println("Publication Year : ["+this.pubyear+"]");
		System.out.println("ISBN : ["+this.isbn+"]");

		
		
		
		
	}
	
	
	
	
	
	
	

}

package lec37_superkeyword;

public class Main {

	public static void main(String[] args) {
		
		 // super = keyword refers to the superclass (parent) of an object
		// 			very similar to the "this" keyword
		
		Hero hero1=new Hero("batman",42,"$");
		Hero hero2=new Hero("superman",37,"all");
		System.out.println(hero1.name);
		System.out.println(hero1.age);
		System.out.println(hero1.powers);
		System.out.println();
		System.out.println(hero2.toString());
		
		
		
		
		
	}
	
	


}

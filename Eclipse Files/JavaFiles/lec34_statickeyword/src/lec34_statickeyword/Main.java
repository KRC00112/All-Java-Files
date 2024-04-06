package lec34_statickeyword;

public class Main {

	public static void main(String[] args) {

		
		// static = modifier. A single copy of a variable/method is created and shared.
		// 			The class "owns" the static member I
		
		
		Friend friend=new Friend("Spongegbob");
		Friend friend2=new Friend("patrick");

		
		System.out.println(Friend.nof);
		
		Friend.displayfriends();

}

}
package package1;
import package2.*;

public class A {

	public static void main(String[] args) {
//		Access Levels
//		Modifier 			Class 	Package 	Subclass	 World

//		public		 			Y 		Y 			Y 			Y//any class,method,attribute that uses public can be called by another method that uses public irrespective of the packages
//		protected 				Y 		Y 			Y 			N//accessible by different class in different package as long as that class is a subclass of whatever class that contains the prot
//		(default)no modifier	Y 		Y 			N 			N//classes within the same package can only call each other
//		private 				Y 		N 			N 			N//something that is private inside a class is only visible to itself
		
		
//		C c=new C();
//		
//		System.out.println(c.publicMessage);
		
		
		B b=new B();
		System.out.println(b.privateMessage);
		
		
		
		
		
	}

}

package lec24_overloadedmethods;

public class Main {

	public static void main(String[] args) {

		//overloaded methods=same name of methods but different parameters within.
		//no of parameters and their datatypes are also taken into account
		
		int x=2;
		int y=5;
		double z=19.98;
		int w=67;
		
		
		
		System.out.println("sum:"+add(1.8,y,z,9));		
		
		
		
	}
	
	
	static int add(int a,int b) {
		
		
		System.out.println("first method");
		
		return a+b;
	
		
	}
	
	static double add(int a,double b,int c) {
		
		System.out.println("second method");
		
		return a+b+c;
	}
	
	static double add(double x,int y,double z,int w) {
		
		System.out.println("third method");
		
		return x+y+z+w;
		
	}
	
	
	

}

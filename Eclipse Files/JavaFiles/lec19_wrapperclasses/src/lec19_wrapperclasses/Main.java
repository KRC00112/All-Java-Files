package lec19_wrapperclasses;

public class Main {

	public static void main(String[] args) {
		//wrapper class-way to use primitive data types as reference data types
		
		//primitive   //wrapper
		//---------------------
//		boolean		  Boolean
//		char		  Character
//		int           Integer		
//		double		  Double
		
		//autoboxing-the automatic conversion that the java compiler makes between the primitive datatypes and their corresponding wrapper class 
		//unboxing-the reverse of autoboing.Automatic conversion of wrapper class to primitive
		
		boolean a=true;
		Character b='#';
		Integer c=123;
		Double d=3.13;
		String e ="kaustav";
		
		String num1="123";
		String num2="123";
		
		
		 int x=Integer.parseInt(num1);
		 int y=Integer.parseInt(num2);
		 
		 System.out.println(x+y);

		 
		 
		
		if(a==true) {
			System.out.println("This is true");
			
			
		}
		
		
	}

}

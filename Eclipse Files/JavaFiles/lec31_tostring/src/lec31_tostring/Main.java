package lec31_tostring;

public class Main {

	public static void main(String[] args) {

		// toString() = special method that all objects inherit,
		// 				that returns a string that "textually represents" an object.
		//				can be used both implicitly and explicitly
		
		
		Car car=new Car();
		
		
		System.out.println(car.make);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.year);
		System.out.println();
		System.out.println(car.toString());//explicit
		System.out.println();
		System.out.println(car);//implicit

		
		
		
		
	}

}

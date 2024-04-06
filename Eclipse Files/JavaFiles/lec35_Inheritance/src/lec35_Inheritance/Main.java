package lec35_Inheritance;

public class Main {
	public static void main(String[] args) {
		
		// inheritance = the process where one class acquires,
		//				 the attributes and methods of another.


		
		Car car=new Car("BMW");
		Bicycle bicycle=new Bicycle("BMX");
		
		System.out.println(car.name);
		System.out.println(car.wheels);
		System.out.println(bicycle.wheels);
		
		
	}
}

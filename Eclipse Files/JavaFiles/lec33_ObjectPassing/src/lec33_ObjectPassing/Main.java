package lec33_ObjectPassing;

public class Main {

	public static void main(String[] args) {
		
		Garage garage=new Garage();
		
		Car car=new Car("ferrari");
		Car car2=new Car("tesla");
		
		garage.park(car);
		garage.park(car2);

		
		
		
		
		
	}

}

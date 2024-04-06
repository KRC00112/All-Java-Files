package inheritanceProblem;

public class Motorcycle extends Vehicle {
	
	
	
	boolean hasSideCar;
	boolean isOffRoad;
	
	

	Motorcycle(String make, String model, int year,boolean hasSideCar,boolean isOffRoad) {
		super(make, model, year);
		
		this.hasSideCar=hasSideCar;
		this.isOffRoad=isOffRoad;
	}
	
	
	
	
	public String getMake() {
		 
		 return make;
	 }
	 
	 public String getModel() {
		 
		 return model;
 
	 }
	 
	 public int getYear() {
		 
		 return year;
 
	 }
	 public boolean getHasSideCar() {
		 
		 return hasSideCar;
	 }
	 public boolean getIsOffRoad() {
		 
		 return isOffRoad;
	 }
	 
	 public String toString() {
		 
		 
		 return super.toString()+"\n"+hasSideCar+"\n"+isOffRoad;
	 }
	 
	 
	 
	 

}

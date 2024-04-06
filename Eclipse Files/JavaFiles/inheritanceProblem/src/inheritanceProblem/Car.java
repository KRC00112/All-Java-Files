package inheritanceProblem;

public class Car extends Vehicle {
	
	int numDoors;
	boolean isConvertible;

	Car(String make, String model, int year,int numDoors,boolean isConvertible) {
		super(make, model, year);
		this.numDoors=numDoors;
		this.isConvertible=isConvertible;
		

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
	 public int getNumDoors() {
		 
		 return numDoors;

	 }
	 public boolean getIsConvertible() {
	 
	 return isConvertible;

 }
	 
	 public String toString() {
		 
		 return super.toString()+"\n"+numDoors+"\n"+isConvertible;
	 }
	

}

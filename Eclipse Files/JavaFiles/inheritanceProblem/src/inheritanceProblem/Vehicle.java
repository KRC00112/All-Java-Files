package inheritanceProblem;

public class Vehicle {
	
	 String make;
	 String model;
	 int year;
	
	 
	 Vehicle(String make,String model,int year){
		 
		 this.make=make;
		 this.model=model;
		 this.year=year;
		 
		 
		 
		 
		 
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
	 
	 public String toString() {
		 
		 return this.make+"\n"+this.model+"\n"+this.year;
	 }
	 
	

}


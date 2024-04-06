package lec41_copyobjects;

public class Car {
	
	private String make;
	private String model;
	private int year;
	
	
	Car(String make,String model,int year){
		
		this.setMake(make);
		this.setModel(model);
		this.setyear(year);
		
	}
	
	Car(Car x){
		
		this.copy(x);
		
		
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
	
	
	public void setMake(String make) {
		this.make=make;
		
	}
	public void setModel(String model) {
		this.model=model;
		
	}
	public void setyear(int year) {
		this.year=year;
		
	}
	
	
	public void copy(Car x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setyear(x.getYear());
		
	}
	
	

}

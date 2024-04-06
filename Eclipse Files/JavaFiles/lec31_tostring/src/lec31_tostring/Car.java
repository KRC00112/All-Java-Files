package lec31_tostring;

public class Car {
	
	String make="chevrollet";
	String model="Gtx";
	String color="Black";
	int year=1989;
	
	//String name="my name"+"your name";
	
	
	public String toString() {
		
		
		
		String myString =make+"\n"+model+"\n"+color+"\n"+year;
		
		return myString;
	}
	
	

}

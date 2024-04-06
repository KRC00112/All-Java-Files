package abstractionProblem;

public class Rectangle implements Shape {
	
	double length;
	double width;

	@Override
	public void calculateArea() {
		
		System.out.println("The area of the rectangle is:"+length*width);
		
		
		
		
		
		
		
	}

	@Override
	public void calculatePerimeter() {
		
		System.out.println("The perimeter of the rectangle is:"+(length+length+width+width));

		
	}


	
	

}

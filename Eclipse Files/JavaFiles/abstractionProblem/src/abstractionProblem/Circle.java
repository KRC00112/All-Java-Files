package abstractionProblem;

public class Circle implements Shape {
	
	final double PI=3.14;
	double radius;

	@Override
	public void calculateArea() {
		
		System.out.println("The area of the circle is:"+(PI*radius*radius));		
		
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("The perimeter of the rectangle is:"+(2*PI*radius));


		
	}

}

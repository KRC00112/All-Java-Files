package lec07_mathfunctions;


public class Main {

	public static void main(String[] args) {

		double x =-3.14;
		double y =9.2;
		
		double compare=Math.max(x, y);
		double absolute=Math.abs(x);
		double sqrt=Math.sqrt(9.8);
		double round=Math.round(x);
		double ceil=Math.ceil(y);
		double floor=Math.floor(x);
		
		
		
		
		System.out.println(compare);
		System.out.println(absolute);
		System.out.println(sqrt);
		System.out.println(round);
		System.out.println(ceil);
		System.out.println(floor);
		
		
		String l="nice guys.finish last";
		
		String t=l.replace(".", "0");
		System.out.println(t);
		
		
		
		
		
		
	}

}

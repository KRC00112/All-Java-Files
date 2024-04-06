package wall_painting_calculator;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter length of Room: ");
		double lengthOfRoom=scanner.nextDouble();
		
		System.out.print("Enter width of Room: ");
		double widthOfRoom=scanner.nextDouble();
		
		System.out.print("Enter height of Room: ");
		double heightOfRoom=scanner.nextDouble();
		
		System.out.print("Enter number of doors: ");
		double doors=scanner.nextDouble();
		
		double doorArea=doors*20;
		
		System.out.print("Enter number of windows: ");
		double windows=scanner.nextDouble();
		
		double windowArea=windows*15;
		
		double calculation=(2*((lengthOfRoom*heightOfRoom)+(widthOfRoom*heightOfRoom))+(lengthOfRoom*widthOfRoom));
		double actualCalc=calculation-(doorArea+windowArea);
		
		
		System.out.println(" ");
		
		System.out.print("Total area to be painted:  "+actualCalc +"sq ft");
		System.out.println();
		
		System.out.println("Total paint required: "+(actualCalc/350)+" galleons");
		
		
	}

}

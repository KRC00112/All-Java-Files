package lec25_printf;

public class Main {

	public static void main(String[] args) {

		// printf() = an optional method to control, format, and display text to the console window
		//			  two arguments = format string + (object/variable/value)
		// 			  % [flags] [precision] [width] [conversion-character]
		
		
		String gun="ak47";
		double decimal=23.9078979;
		Boolean myBoolean=true;
		char mychar='d';
		int mynum=46;
		
		float a=0.1F;
		float b=0.2F;
		float c=a+b;
		System.out.println(c);
		System.out.printf("%.15f",c);
		System.out.println();
		
		
		//[conversion-character]
		System.out.printf("This is a format string %s \n",gun);
		System.out.printf("This is a format string %f \n",decimal);
		System.out.printf("This is a format string %b \n",myBoolean);
		System.out.printf("This is a format string %c \n",mychar);
		System.out.printf("This is a format string %d \n",mynum);

		//[width]
		// minimum number of characters to be written as output
		System.out.printf("Hello %10s\n",gun);
		
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		System.out.printf("You have this much money %.3f \n",decimal);
		
		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// -: left-justify
		// + : output a plus (+) or minus ( - ) sign for a numeric value
		// 0 numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		
		System.out.printf("You have this much money %+f", decimal);
//		
		
		
	}

}

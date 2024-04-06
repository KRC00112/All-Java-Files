package hours_minutes_seconds;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter number of seconds: ");
		
		double seconds=scanner.nextInt();
		
		
		double hours=Math.floor(seconds/3600);
		double decimalHours=(seconds/3600)-Math.floor(hours);
		double minutes=Math.floor(decimalHours*60);
		double decimalMinutes=(decimalHours*60)-Math.floor(minutes);
		double sec=Math.floor(decimalMinutes*60);
		
		System.out.println("Number of hours: "+hours);
		System.out.println("Number of minutes: "+minutes);
		System.out.println("Number of seconds: "+sec);

		System.out.println(hours+":"+minutes+":"+sec);
		
	}

}

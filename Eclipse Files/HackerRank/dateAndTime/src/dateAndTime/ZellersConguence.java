package dateAndTime;

public class ZellersConguence {

	public static void main(String[] args) {

		int year=2024;
		int month=2;
		int day=22;
		int k=0;
		int j=0;
		
		if(month<3) {
			k=year-5;
			j=year/100;
			
		}
		else {
		 k=year+1;
		 j=year/100;
		}
		
		int f=day+((13*(month+1))/5)+k+(j/4)+5*j;
		
		day=f%7;
				
		System.out.println(day);
		
	}

}

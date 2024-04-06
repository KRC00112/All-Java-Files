

public class twod{
	public static void main(String[]args){
		
		
		
		String[][] cars={
				 
				 {"Camero","Buggati","Ferrari"},
				 {"corvette","","Mustang"},
				 {"Ranger","Silverado","F-150"}
				 
				 };
		
		/*String[][] cars =new String[3][3];*/
		
		/*cars[0][0]="Camero";
		cars[0][1]="Buggati";
		cars[0][2]="Ferrari";
		cars[1][0]="corvette";

		cars[1][2]="Mustang";
		cars[2][0]="Ranger";
		cars[2][1]="Silverado";
		cars[2][2]="F-150";*/
		
		
		for(int i=0;i<cars.length;i++){
			System.out.println(" ");
			for(int j=0;j<cars[i].length;j++){
				System.out.print(cars[i][j]+" ");
			
			
			}
		
		
		
		}
		
		
		
		
		
	
	}


}

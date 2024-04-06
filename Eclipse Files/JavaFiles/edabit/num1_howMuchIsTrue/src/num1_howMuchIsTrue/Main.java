package num1_howMuchIsTrue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean[] array= {false,false,false};
		
		countTrue(array);
	}
	
	static int countTrue(boolean array[]) {
		
		int n=0;
		for(int i=0;i<array.length;i++) {
			
			if(array[i]==true) {
				n++;
			}
			
			
		}
		
		System.out.println(n);
		return n;
		
		
		
	}
	
	

}

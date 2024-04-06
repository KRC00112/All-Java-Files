package maximumInAnArray;

public class Main {
	
	public static void main(String[] args) {
		
		
		int array[]= {1,78,32,8,101,66,2};
		
		
		
		int greatest;
		
		for(int i=0;i<array.length;i++) {
			
			
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]>array[j]) {
					
					
					greatest=array[i];
					
					
					
					
				}
				
				System.out.println(greatest);
				
			}
			
			
			
			
		}
		
		
		
	}

}

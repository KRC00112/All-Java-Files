package factorial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int num=7;
		
		if(num==0) {
			
			num=1;
			
		}
		else {
			for(int i=num-1;i>=1;i--) {
								
					num=num*i;
		
			}
		
		}
		
		
		
		System.out.println(num);
				
		
		

	}

}

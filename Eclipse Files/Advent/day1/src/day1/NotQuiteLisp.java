package day1;

public class NotQuiteLisp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String levels="(())";
		
		int x=1;
		
		int res = 0;
		
		for(int i=0;i<levels.length();i++) {
			
			
			
			System.out.println(levels.charAt(i));
			
			if(levels.charAt(i)=='(') {
				
				res=0+x;
				
				
			}
			
			if(levels.charAt(i)==')') {
				
				res=0-x;
				
				
			}
			
			System.out.println(res);
			
			
			
			
			
			
			
			
			
		}
		
		
		
		

	}

}

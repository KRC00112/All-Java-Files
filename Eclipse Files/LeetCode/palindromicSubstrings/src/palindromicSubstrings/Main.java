package palindromicSubstrings;

public class Main {
	
	
	 public static int countSubstrings(String s) {
		 	
		 int count=0;
				for(int i=0;i<s.length();i++) {
					
					for( int j=i+1;j<=s.length();j++) {
												
						String ori=s.substring(i,j);
						
						String reverse="";
						
							for(int k=ori.length()-1;k>=0;k--) {
								
								
								 reverse=reverse+ori.charAt(k);		
								 
								 if(ori.equalsIgnoreCase(reverse)) {
										
										System.out.println(ori);
										count++;
									}
								
							}
					}
	
				}
				
				return count;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(countSubstrings("Hannah"));
	}

}

package endOfFIle;

import java.util.Scanner;




public class Solution {
	
	public static void main(String[] args) {
		
		
		
		
		Scanner scanner=new Scanner(System.in);
		
		int line=1;
		
		while(scanner.hasNext()) {
		
		String input=scanner.nextLine();
		System.out.println(line+" "+input);
		line++;
		
		
		}
		 
	
		
//	
//		String input="Hello world\r\n"
//				+ "I am a file\r\n"
//				+ "Read me until end-of-file.";
//		
//		String[] inputl=input.split("\r\n");
//		
//	
//		
//		
//		for(int i=0;i<inputl.length;i++) {
//			
//			
//			System.out.println((i+1)+" "+inputl[i]);
//			
//			
//		}
		
		
	}
	

}

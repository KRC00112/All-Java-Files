package staticParallelogram;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static boolean flag;
	
	static Scanner scanner=new Scanner(System.in);
	static int B=scanner.nextInt();
	static int H=scanner.nextInt();
	static{
	if(B<=0||H<=0) {
		
		flag=false;
		System.out.println("java.lang.Exception: Breadth and height must be positive");
	}
	else if(B>0&&H>0) {
		
		flag=true;
	}
	
	
	}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class


package waterConsumption;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		
		Scanner scanner=new Scanner(System.in);
		int T=scanner.nextInt();
		scanner.nextLine();
		
		while(i<T){
		    
		    int X=scanner.nextInt();
		    if(X>=2000){
		        
		        System.out.println("YES");
		        
		    }
		    else{
		        System.out.println("NO");
		    }
		    
		    
		    
		    i++;
		}
		
		

	}

}

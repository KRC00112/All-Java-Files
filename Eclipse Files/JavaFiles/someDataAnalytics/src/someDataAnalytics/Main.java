package someDataAnalytics;

import java.util.Arrays;
import java.util.Scanner;


import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	
    	String pRow = null;
    	String cRow = null;
    	String mRow = null;
    	
    	
    	
    	Scanner PhysicsData=new Scanner(new File("Marks.csv"));
    	PhysicsData.useDelimiter(" ,");
    	

    	while(PhysicsData.hasNext()) {
    		 pRow=PhysicsData.next().substring(57,92);
    	}
    	
    	Scanner ChemistryData=new Scanner(new File("Marks.csv"));
    	ChemistryData.useDelimiter(" ,");
    	

    	while(ChemistryData.hasNext()) {
    		 cRow=ChemistryData.next().substring(104,139);
    	}
    	
    	Scanner MathData=new Scanner(new File("Marks.csv"));
    	MathData.useDelimiter(" ,");
    	

    	while(MathData.hasNext()) {
    		 mRow=MathData.next().substring(147,184);
    	}
    	
    	
    	
    	
    	System.out.println(pRow);
    	System.out.println(cRow);
    	System.out.println(mRow);
    	
    	
    	String[] pRowArray=pRow.split(",");
    	String[] cRowArray=cRow.split(",");
    	String[] mRowArray=mRow.split(",");

    	
    	
    	for(int i=0;i<pRowArray.length;i++) {
    		
    		
    		int intPhysics=Integer.parseInt(pRowArray[i]);
    		
    		System.out.print(intPhysics+" ");
    		
    	}
    	for(int i=0;i<cRowArray.length;i++) {
    		
    		
    		int intChemistry=Integer.parseInt(cRowArray[i]);
    		
    		System.out.print(intChemistry+" ");
    		
    	}
    	for(int i=0;i<mRowArray.length;i++) {
    		
    		
    		int intMaths=Integer.parseInt(mRowArray[i]);
    		
    		System.out.print(intMaths+" ");
    		
    	}

    	
    	
    	
    	
    	
    	
    	
    	
    	System.out.println("\n\n");
    	
    	int[] physics= {42,71,63,55,51,47,72,59,44,70,65,56};
    	int[] chemistry= {85,67,57,79,75,77,65,58,61,63,72,76};
    	int[] math= {63,69,60,67,63,75,81,54,72,57,81,56};


    	
    	
//    	System.out.println("Physics");
//    	Analysis(physics);
//    	System.out.println();
//    	System.out.println("Chemistry");
//    	Analysis(chemistry);
//    	System.out.println();
//    	System.out.println("Maths");
//    	Analysis(math);
//    	System.out.println();
    	
    	
    	

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
       
    }
    
    
    public static void Analysis(int[] subject) {
    	
    	System.out.print("Unsorted Array: ");
    	
    	for(int i=0;i<subject.length;i++) {
    		
    		System.out.print(subject[i]+" ");
    		
  
    		
    	}
    	System.out.println();
    	
    	System.out.print("Sorted Array: ");
    	
    	Arrays.sort(subject);
    	
    	for(int i=0;i<subject.length;i++) {
    		
    		System.out.print(subject[i]+" ");
    		
  
    		
    	}
    	
    	
    	System.out.println();
    	System.out.println("Minimum is: "+subject[0]);
    	System.out.println("Maximum is: "+subject[subject.length-1]);
    	
    	
    	if(subject.length%2==0) {
    		
//    		System.out.println("Even");
    		float firstMNum=subject[(subject.length/2)-1];
    		float secondMNum=subject[((subject.length/2)+1)-1];
    		float Median=(firstMNum+secondMNum)/2;
    		
    		
    		
    		System.out.println("Median is "+Median);
    		
    		
//    		System.out.println(firstMNum);
//    		System.out.println(secondMNum);
    		
    		
    		for(int i=0;i<=(subject.length/2)-1;i++) {
    			
    			
//    			System.out.println(subject[i]);
//    			System.out.println("The First Quartile "+subject[subject.length/2]);
    			
    			
    			
    		}
    		System.out.println("The First Quartile: "+((float)subject[((subject.length/2)-1)/2]+subject[(((subject.length/2)-1)/2)+1])/2);
    		
    		
    		for(int i=((subject.length/2)+1)-1;i<=subject.length-1;i++) {
    			
    			
//    			System.out.println(subject[i]);
//    			System.out.println("The First Quartile "+subject[subject.length/2]);
    			
    			
    			
    		}
    		System.out.println("The Third Quartile: "+((float)subject[(((subject.length/2)+1)-1)+2]+subject[(((subject.length/2)+1)-1)+3])/2);
    		
 
    	
    	   		

    		
    		
    		
    	}
    	else {
    		
//    		System.out.println("odd");
    		int Median=subject[subject.length/2];
    		System.out.println("Median is "+Median);	
    		System.out.println("The First Quartile: "+(float)subject[((subject.length+1)/4)-1]);
    		System.out.println("The Third Quartile: "+(float)subject[((3*(subject.length+1))/4)-1]);

    	}
    	
    	
    	
    }
    
    
 
    
    
    
    
}

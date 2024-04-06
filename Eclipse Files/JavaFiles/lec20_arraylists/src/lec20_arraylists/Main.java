package lec20_arraylists;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int remainder=N%2;
        
        
        if(remainder!=0){
            System.out.println("Weird");
        }
        else if(remainder==0){
            if(N>=2&&N<=5){
                System.out.println("Not Weird");
                
            }
            else if(N>=6&&N<=20){
                System.out.println("Weird");
            }
            else if(N>20){
                System.out.println("Not Weird");
            }
        }
        
        

    
//    System.out.println("Hello");
    
    }
}

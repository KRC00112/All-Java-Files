import java.util.Arrays;
import java.util.Scanner;

public class number2 {


//    2. Write a program to store 8 random numbers in an array in
//    ascending order. Find whether the number 39 is present in the array
//    or not.
    public number2(){


        Scanner scanner=new Scanner(System.in);

        int arraySize=8;
        int[] numbers=new int[arraySize];

        System.out.print("Enter eight numbers: ");


        for(int i=0;i<arraySize;i++){
            int num=scanner.nextInt();
            numbers[i]=num;

        }

        Arrays.sort(numbers);

        boolean isPresent=false;

         for (int i:numbers){

             if(i==39){
                 isPresent=true;
             }

         }


         if(isPresent) {

             System.out.println("39 is present");

         }
         else{
             System.out.println("39 is not present");
         }









    }
}

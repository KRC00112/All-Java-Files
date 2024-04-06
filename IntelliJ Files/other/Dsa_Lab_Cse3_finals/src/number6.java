import java.util.Scanner;

public class number6 {

//    6. Write a C program to store 11 random numbers in an array in
//    unsorted order. Find whether the number 50 is present in the array or
//    not.


    public number6(){


        int arraySize=11;

        int[] numbers=new int[arraySize];

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter eleven numbers: ");

        for(int i=0;i<arraySize;i++){

            int num=scanner.nextInt();

            numbers[i]=num;

        }

        boolean isPresent=false;

        for(int i:numbers){

            if(i==50){
                isPresent=true;
            }

        }

        if(isPresent){

            System.out.println("50 is present");

        }
        else{
            System.out.println("50 is not present");
        }






    }



}

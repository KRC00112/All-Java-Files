import java.util.Arrays;
import java.util.Scanner;

public class number14 {


//    14. Write a program to store 9 random numbers in an array in
//    descending order. Find whether the number 71 is present in the array
//    or not.

    public number14(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter nine numbers: ");
        int arraySize=9;
        int[] numbers=new int[arraySize];
        for(int i=0;i<arraySize;i++){
            int num=scanner.nextInt();
            numbers[i]=num;

        }

        Arrays.sort(numbers);

        int[] numbersDescending=new int[arraySize];
        int j=0;
        for(int i=numbers.length-1;i>=0;i--){


            numbersDescending[j]=numbers[i];

            j++;


        }

        boolean isPresent = false;

        for(int i:numbersDescending){



            if(i==71){
                isPresent=true;

            }

            System.out.print(i+" ");


        }

        System.out.println();
        if(isPresent==true){

            System.out.println("71 is present.");
        }
        if(isPresent==false){
            System.out.println("71 is not present.");
        }




    }

}

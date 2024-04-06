import java.util.Arrays;
import java.util.Scanner;

public class number10 {

//    10. Write a program to find out the minimum of 11 integers stored
//    in an array.
//
    public number10(){


        Scanner scanner=new Scanner(System.in);
        int arraySize=11;
        System.out.print("Enter eleven numbers: ");
        int[] numbers = new int[arraySize];
        for(int i=0;i<arraySize;i++) {

            int num=scanner.nextInt();
            numbers[i]=num;

        }
        Arrays.sort(numbers);



        System.out.println("The minimum of all the numbers in the array is "+numbers[0]);




    }


}



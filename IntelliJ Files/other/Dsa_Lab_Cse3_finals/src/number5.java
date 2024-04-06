import java.util.Arrays;
import java.util.Scanner;

public class number5 {


//    5. Write a program to sort 11 numbers in an array in descending
//    order.
    public number5(){

        Scanner scanner=new Scanner(System.in);

        int[] numbers=new int[11];
        System.out.print("Enter eleven numbers: ");
        for(int i=0;i<11;i++){
            int num=scanner.nextInt();
            numbers[i]=num;

        }

        Arrays.sort(numbers);

        for(int i=numbers.length-1;i>=0;i--){

            System.out.print(numbers[i]+" ");

        }







    }


}

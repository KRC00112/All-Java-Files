import java.util.Arrays;
import java.util.Scanner;

public class number4 {

//    4. Write a program to find out the maximum of 9 integers stored in
//    an array.

    public number4(){

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[9];
        System.out.print("Enter nine numbers: ");

        for (int k = 0; k < 9; k++) {
            int num = scanner.nextInt();

            numbers[k] = num;

        }

        Arrays.sort(numbers);
        System.out.println("The maximum of all the numbers in the array is "+numbers[numbers.length-1]);





    }




}

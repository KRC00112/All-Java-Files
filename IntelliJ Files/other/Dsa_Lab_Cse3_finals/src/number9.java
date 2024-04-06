import java.util.Scanner;

public class number9 {

//    9. Write a program to find out the digits of a number by using a user
//    defined function.

    public number9(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= scanner.nextInt();

        String stringNum=String.valueOf(num);

        String[] array=stringNum.split("");

        int[] numbers=new int[stringNum.length()];

        for(int i=0;i<array.length;i++){

            int nums=Integer.parseInt(array[i]);


            numbers[i]=nums;

        }


        for (int i:numbers){
            System.out.print(i+" ");
        }


    }

}

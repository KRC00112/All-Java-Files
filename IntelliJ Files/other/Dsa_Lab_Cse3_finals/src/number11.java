import java.util.Scanner;

public class number11 {

//    11. Write a program to find the factorial of a number by using user
//    defined functions. The program should calculate factorial of only even
//    numbers and not of odd numbers.
    public number11(){


        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num=scanner.nextInt();
        int originalNum=(int)num;

        if(num%2!=0){
            System.out.println(num+" is an odd number");

        }


        if(num%2==0) {

            long num1 = num;

            for (long i = num; i > 1; i--) {

                num1=num1-1;

                num = num * num1;


            }


            System.out.println(originalNum+" is an even number and "+originalNum+"! = "+num);

        }







    }


}

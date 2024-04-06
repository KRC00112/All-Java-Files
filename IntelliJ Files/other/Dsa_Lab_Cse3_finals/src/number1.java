import java.util.Scanner;

public class number1 {

//    1. Write a program to store 9 integers in an array. Find the number
//    of even numbers and prime numbers in the array.

    public number1() {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[9];
        System.out.print("Enter nine numbers: ");
        for (int k = 0; k < 9; k++) {
            int num = scanner.nextInt();
            numbers[k] = num;
        }
        int countEven = 0;
        int countPrime = 0;
        boolean isPrime=true;
        for(int i : numbers){
            if(i%2==0){
                countEven++;
            }
            else if(i==1 || i==0 ||i%2==0){
                continue;
            }
            else if(i==2){
                countPrime++;
            }
            else {
                for (int j = 3; j <= Math.sqrt(i); j+=2) {
                    if (i % j == 0) {
                        isPrime=false;
                        break;
                    }
                }
                if(!isPrime){
                    countPrime++;
                }
            }
        }
        System.out.println("There are " + countEven + " even numbers in the array.");
        System.out.println("There are " + countPrime + " prime numbers in the array.");
    }
}

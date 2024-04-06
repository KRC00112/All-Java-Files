import java.util.Scanner;

public class number3 {


//    3. Write a program to store 7 integers in an array. Find the number
//    of odd numbers and prime numbers in the array.

    public number3(){


        int arraySize=7;

        int[] numbers=new int[arraySize];

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter seven numbers: ");

        for(int i=0;i<arraySize;i++){

            int num= scanner.nextInt();
            numbers[i]=num;

        }

        int countOdd=0;
        int countPrime=0;


        for(int i : numbers){

            if(i%2!=0){

                countOdd++;

            }

            for(int j=2;j<=Math.sqrt(i);j++){

                if(i%j==0){
                    continue;
                }
                else{
                    countPrime++;
                }

            }

            if(i==2||i==3){
                countPrime++;
            }
            if(i==1){
                continue;
            }



        }

        System.out.println("Number of odd numbers in the array "+countOdd);
        System.out.println("Number of prime numbers in the array "+countPrime);







    }


}

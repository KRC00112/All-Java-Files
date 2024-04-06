import java.util.Scanner;

public class number16 {
//    16. Write a program to print first n prime numbers where n is the
//    input given by the user using scanner.

    number16(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= scanner.nextInt();

        for(int i=2;i<=num;i++){


            for(int j=3;j<Math.sqrt(i);j+=2){



                if(i%j==0){
                    continue;
                }
                else{
                    System.out.println(j);
                }


            }





        }



    }

}

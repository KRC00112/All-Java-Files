import java.util.Scanner;

public class number12 {

//    12. Write a program to take a positive number as input and then
//    print the reverse of that number and find out whether the number is a
//    palindrome or not.

    public number12(){



        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=scanner.nextInt();

        if(num<0){
            System.out.println("Not a positive number");
        }

        else {

            String stringNum = String.valueOf(num);
            String store = "";

            for (int i = stringNum.length() - 1; i >= 0; i--) {

                store = store + stringNum.charAt(i);


            }


            int reversedNum = Integer.parseInt(store);
            System.out.println("The reversed number: " + reversedNum);

            if (num == reversedNum) {
                System.out.println(num + " is a palindrome");
            }
            if (num != reversedNum) {
                System.out.println(num + " and " + reversedNum + " are not palindromes");
            }


        }

    }
}

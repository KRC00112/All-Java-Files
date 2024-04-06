package lec07_mathfunctions;


import java.util.Scanner;

public class ChainAddition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");

        int result = 0;

        // We'll initialize num1 with a sentinel value of 0
        int num1 = 0;
        String exit;

        do {
            int num2 = scanner.nextInt(); // Read the next number
            result = num1 + num2;
            num1 = result;

            scanner.nextLine();
            System.out.println("Stop?");
            exit = scanner.nextLine();

        } while (exit.equalsIgnoreCase("n"));

        System.out.print(num1);

    }
}


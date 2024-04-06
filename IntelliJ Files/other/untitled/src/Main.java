// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        for(int n=1;n<=100;n++) {


            int i = 0;

            for (i = 2; i <= n - 1; i++) {

                if (n % i == 0) {
                    break;
                }


            }

            if (i == n) {

                System.out.println(n + " is prime.");

            } else {
                System.out.println(n + " is not prime");
            }


        }

    }
}
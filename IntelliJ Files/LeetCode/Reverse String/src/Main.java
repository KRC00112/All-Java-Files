import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        long start = System.nanoTime();

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);

        long end = System.nanoTime();

        // Convert nanoseconds to milliseconds
        long elapsedTimeMillis = (end - start) / 1_000_000;

        System.out.println("Time taken: " + elapsedTimeMillis + " milliseconds");



    }

    public static void reverseString(char[] s) {

        char temp;
        int n= s.length;
        for(int i=0;i<=(n-2)/2;i++){

            temp= s[i];
            s[i]=s[n-1-i];
            s[n-1-i]=temp;

        }

        for(char i: s){
            System.out.print(i);
        }


    }


}
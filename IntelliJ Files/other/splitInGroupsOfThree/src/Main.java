import java.util.ArrayList;
import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        String letters="ATGGCTAGTTAC";

        System.out.println("length: "+letters.length());
        int j=0;
        String singleCodon="";

        ArrayList <String> codons=new ArrayList<>();

        for(int i=0;i<letters.length();i+=3){

            j=i+3;

            singleCodon=letters.substring(i,j);

            codons.add(singleCodon);



        }

        System.out.println(codons);










    }
}
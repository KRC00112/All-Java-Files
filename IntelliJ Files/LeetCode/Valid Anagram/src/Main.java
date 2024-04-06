import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(isAnagram("angaram","ngramaa"));
        System.out.println(isAnagram("aacc","ccac"));


        System.out.println("angaram".length()+""+"ngramama".length());
    }



    public static boolean isAnagram(String s, String t) {
        boolean anagram = false;
        int count=0;

         if(s.length()==t.length()){

            String[] sa=s.split("");
            String[] ta=t.split("");
            Arrays.sort(sa);
            Arrays.sort(ta);


            if(Arrays.equals(sa,ta)){

                anagram=true;

            }
        }

         else{
             anagram=false;
         }
        return anagram;
    }
}
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      String[] words={"dog","racecar","car"};
      int max=Maximum(words);

        String longest="";
        int stop;
        String second="";
        String first="";
        for(int i=0;i<max;i++) {


            for(int j=0;j<words.length;j++) {

                stop=j;
                first = words[j].substring(0, stop);
                second = first;

                if (first.equals(second) ) {
                    longest=first;

                }





            }



        }

        System.out.println(longest);




    }



    public static int Maximum(String[] words){
        int x=0;
        int[] wordsLengths=new int[words.length];
        int j=0;
        for(int i=0;i<words.length;i++){
            wordsLengths[j]=words[i].length();
            j++;
        }
        Arrays.sort(wordsLengths);
        x=wordsLengths[words.length-1];

        return x;
    }


    public static void LCP(){

    }





}
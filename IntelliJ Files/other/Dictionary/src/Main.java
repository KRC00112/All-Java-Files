import java.util.HashSet;
import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        String text="The Lion King is a 1994 American animated musical " +
                "coming-of-age drama film[4][5] produced by Walt Disney " +
                "Feature Animation and released by Walt Disney Pictures. " +
                "The film was directed by Roger Allers and Rob Minkoff " +
                "(in their feature directorial debuts) and produced by " +
                "Don Hahn, from a screenplay written by Irene Mecchi, " +
                "Jonathan Roberts, and Linda Woolverton. The film " +
                "features an ensemble voice cast that includes Matthew " +
                "Broderick, Moira Kelly, James Earl Jones, Jeremy Irons, " +
                "Jonathan Taylor Thomas, Nathan Lane, Ernie Sabella, Whoopi " +
                "Goldberg, Cheech Marin, Rowan Atkinson, and Robert Guillaume. " +
                "Its original songs were written by composer Elton John and " +
                "lyricist Tim Rice, with a score by Hans Zimmer. Inspired by " +
                "African wildlife, the story is modelled primarily on William " +
                "Shakespeare's stage play Hamlet with some influence from the " +
                "Biblical stories of Joseph and Moses, and follows a young heir " +
                "apparent who is forced to flee after his uncle kills his father " +
                "and usurps the throne. After growing up in exile, the rightful " +
                "king returns to challenge the usurper and end his tyrannical rule " +
                "over the kingdom.";

        //preprocessing
        String[] syms={",",".",";",":","(",")"};

        for(String i :syms){


            text=text.replace(i,"");


        }
        //end preprocessing


        makeDict(text);



    }


    public static void makeDict(String text){
        String[] dict=text.split(" ");


        HashSet<String> hs=new HashSet<String>();


        int count=0;

        String word="";

        for(int j=0;j<dict.length;j++) {

            word=dict[j];


            for (int i = 0; i < dict.length; i++) {

                if (dict[i].equalsIgnoreCase(word)) {

                    count++;

                }


            }

//            System.out.println(word+":"+countk);
            hs.add(word+": "+count);
            count=0;


        }


//        System.out.println(hs);



        for(String i: hs){

            System.out.println(i);



        }
    }
}
import java.util.Arrays;

public class test {

    public static void main(String[] args){

        String s="name";
        String t="tame";

        String[] sa=s.split("");
        String[] ta=t.split("");


        Arrays.sort(sa);
        for(String i : sa){

            System.out.println(i);
        }






    }


}

public class preProcessing {

    public static void main(String[] args) {
        String text="hello i am kaustav hello, i i i. kaustav mom";


       String[] syms={",","."};


//        text=text.replace(","," ");


        for(String i :syms){


            text=text.replace(i,"");


        }

        System.out.println(text);





    }

}

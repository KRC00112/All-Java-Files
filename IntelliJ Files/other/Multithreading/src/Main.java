// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) throws InterruptedException {
        String symbol="";


        System.out.print("[");
        for (int i = 0; i <= 30; i++) {


            if(i>10){
                symbol="#";
            }
            else{
                symbol="\u25A0";
            }

            System.out.print(symbol);


            Thread.sleep(100);
        }
        System.out.print("]");
    }
}

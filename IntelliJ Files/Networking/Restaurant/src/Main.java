// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] items={"Pizza:       $120","Hamburger:   $70","Noodles:     $90","Taco:        $70","Piña colada: $100"};

        for(int i=0;i<5;i++){

            items[i]=items[i].substring(0,items[i].indexOf(":"));

        }






        for(String i : items){
            System.out.println(i);
        }



    }
}
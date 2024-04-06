import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {


        try {
            System.out.println("Client Connected.");
            Socket soc = new Socket("localhost", 5000);

            BufferedReader inTunnel=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String serverGreet=inTunnel.readLine();

            System.out.println("Server says: "+serverGreet);

            System.out.println("_____________________________________________");
            System.out.println("               RESTAURANT MENU               ");
            System.out.println("_____________________________________________");

            String[] items={"Pizza:       $120","Hamburger:   $70","Noodles:     $90","Taco:        $70","Piña colada: $100","Exit"};




            int j=1;
            for (String i:items){

                System.out.println(j+". "+i);
                j++;
            }


            for(int i=0;i<items.length-1;i++){

                items[i]=items[i].substring(0,items[i].indexOf(":"));

            }
            int intOrder=0;

            int intQty=0;


            int product=0;
            int price=0;
            int sum=0;

            do {
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter your choice: ");
                String order = input.readLine();
                intOrder = Integer.parseInt(order);


                if (intOrder == 1) {
                    order = items[0];
                    price=120;
                }
                if (intOrder == 2) {
                    order = items[1];
                    price=70;

                }
                if (intOrder == 3) {
                    order = items[2];
                    price=90;

                }
                if (intOrder == 4) {
                    order = items[3];
                    price=70;

                }
                if (intOrder == 5) {
                    order = items[4];
                    price=100;

                }





                    System.out.print("Enter Quantity of " + order + ": ");
                    String qty = input.readLine();
                    intQty = Integer.parseInt(qty);

//                    product=price*intQty;
//                    sum=sum+product;

                PrintWriter outTunnel=new PrintWriter(soc.getOutputStream(),true);
                outTunnel.println(order);
                outTunnel.println(intQty);
                outTunnel.println(intOrder);

                if (intOrder == 6) {

                    String stringSum=inTunnel.readLine();
                    int sumx=Integer.parseInt(stringSum);


                    System.out.println(sumx);

                    break;



                }





            }while(true);













        }
        catch (Exception e){
            e.printStackTrace();
        }




    }
}

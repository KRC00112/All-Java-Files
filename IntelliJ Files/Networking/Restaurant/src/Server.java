import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {


        try {
            System.out.println("Awaiting Response...");
            ServerSocket ss = new ServerSocket(5000);
            Socket soc = ss.accept();
            System.out.println("Connection Established.");

            BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
            String greet="Welcome to the Food Ordering System!";

            PrintWriter outTunnel=new PrintWriter(soc.getOutputStream(),true);
            outTunnel.println(greet);


            int product=0;
            int price=0;
            int sum=0;
            int intOrder;
            BufferedReader inTunnel = new BufferedReader(new InputStreamReader(soc.getInputStream()));


            do {

                String order = inTunnel.readLine();
                String qty = inTunnel.readLine();
                int intQty = Integer.parseInt(qty);
                String stringOrder= inTunnel.readLine();
                intOrder=Integer.parseInt(stringOrder);


                System.out.println("Client ordered " + intQty + " " + order);
                System.out.println(intOrder);

                if(intOrder==1){
                    price=120;
                }
                if(intOrder==2){
                    price=70;
                }
                if(intOrder==3){
                    price=90;
                }
                if(intOrder==4){
                    price=70;
                }
                if(intOrder==5){
                    price=100;
                }




                product=price*intQty;
                sum=sum+product;

                if(intOrder==6){

                    outTunnel.println(sum);
                    break;

                }





            }while(true);





        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}

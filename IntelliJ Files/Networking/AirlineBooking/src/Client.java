import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;

public class Client {

    public static void main(String[] args){


        try {
            System.out.println("Client Connected.");
            Socket soc = new Socket("localhost", 1024);

            while(true) {
                BufferedReader inTunnel = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                String seatList = inTunnel.readLine();


                System.out.print("Seats         : ");
                System.out.println(seatList);

                System.out.print("Enter seat No.: ");

                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                String stringSeat = input.readLine();


                if (!stringSeat.equalsIgnoreCase("bye")) {


                    PrintWriter outTunnel = new PrintWriter(soc.getOutputStream(), true);
                    outTunnel.println(stringSeat);

                    System.out.print("Updated Seats : ");
                    seatList = inTunnel.readLine();
                    System.out.println(seatList);

                }


            }








        }
        catch (Exception e){
            e.printStackTrace();
        }


    }


}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.LinkedList;

public class Server {

    public static void main(String[] args){

        try {

            System.out.println("Awaiting Response...");
            ServerSocket ss = new ServerSocket(1024);
            Socket soc = ss.accept();
            System.out.println("Connection Established.");


            LinkedList<String> seats = new LinkedList<String>();



            int noOfSeats=15;


            for (int i = 1; i <= noOfSeats; i++) {


                String x = String.valueOf(i);


                seats.add(x);


            }

            System.out.print("Seats        : ");
            System.out.println(seats);

            while(true) {
            PrintWriter outTunnel = new PrintWriter(soc.getOutputStream(), true);
            outTunnel.println(seats);


            BufferedReader inTunnel = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String seatToDelete = inTunnel.readLine();

            int intSeatToDelete = Integer.parseInt(seatToDelete);


            int j = intSeatToDelete;


            if (intSeatToDelete == j) {

//                seats.remove(i-1);
                seats.set(j - 1, "x");


            }

            System.out.print("Updated Seats: ");

            System.out.println(seats);
            outTunnel.println(seats);


        }






        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

}

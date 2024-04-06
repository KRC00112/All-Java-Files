import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            System.out.println("Awaiting Response...");
            ServerSocket ss = new ServerSocket(6067);
            Socket soc = ss.accept();
            System.out.println("Connection Established.");

            BufferedReader inTunnel=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String numberString= inTunnel.readLine();

            int x=Integer.parseInt(numberString);

            for(int i=0;i<x;i++){

                System.out.print("* ");


            }




        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class Server {

    public static void main(String[] args){


        try {
            System.out.println("Awaiting Response...");
            ServerSocket ss=new ServerSocket(9806);
            Socket soc=ss.accept();
            System.out.println("Connection Established.");
            String clientMsg;
            PrintWriter outTunnel = null;
            while(true) {

                BufferedReader inTunnel = new BufferedReader(new InputStreamReader(soc.getInputStream()));

                clientMsg= inTunnel.readLine();
                System.out.println("Client Says: " + clientMsg);

                if(clientMsg.equalsIgnoreCase("stop")){


                    outTunnel.println(clientMsg);
                    inTunnel.close();

                    break;
                }

                BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter a String: ");
                String str = serverInput.readLine();
                outTunnel = new PrintWriter(soc.getOutputStream(), true);
                outTunnel.println(str);
            }



        }
        catch (Exception e){
            e.printStackTrace();
        }



    }


}

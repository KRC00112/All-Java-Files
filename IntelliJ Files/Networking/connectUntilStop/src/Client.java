import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args){


        try {
            System.out.println("Client Started.");
            Socket soc = new Socket("localhost", 9806);
            while(true) {
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter a String: ");
                String str = userInput.readLine();
                PrintWriter outTunnel = new PrintWriter(soc.getOutputStream(), true);
                outTunnel.println(str);
                BufferedReader inTunnel = new BufferedReader(new InputStreamReader(soc.getInputStream()));

                String serverMsg=inTunnel.readLine();

                System.out.println("Server says: " + serverMsg);

                if(serverMsg.equalsIgnoreCase("stop")){

                    inTunnel.close();
                    break;
                }



            }

        }

        catch (Exception e){
            e.printStackTrace();
        }




    }

}

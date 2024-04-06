import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args){


        try {
            System.out.println("Awaiting Response...");
            ServerSocket ss = new ServerSocket(6666);
            Socket soc = ss.accept();
            System.out.println("Connection Established");
            BufferedReader inTunnel=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String clientNumber1=inTunnel.readLine();
            String clientNumber2=inTunnel.readLine();


            int x=Integer.parseInt(clientNumber1);
            int y=Integer.parseInt(clientNumber2);
            int product=x*y;


            System.out.print(x+" x "+y+" = "+product);



        }
        catch (Exception e){
            e.printStackTrace();
        }





    }

}

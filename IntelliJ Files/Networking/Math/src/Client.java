import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {

    public static void main(String[] args){


        try {
            System.out.println("Client Connected");
            Socket soc = new Socket("localhost",6666);

            BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter two numbers: ");
            String numberString1= input.readLine();
            String numberString2= input.readLine();
            PrintWriter outTunnel=new PrintWriter(soc.getOutputStream(),true);
            outTunnel.println(numberString1);
            outTunnel.println(numberString2);





        }
        catch (Exception e){
            e.printStackTrace();
        }

    }


}

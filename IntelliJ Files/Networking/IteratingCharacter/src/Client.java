import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {


        try {
            System.out.println("Client Connected");
            Socket soc = new Socket("localhost", 6067);

            BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter number: ");
            String number=input.readLine();
            PrintWriter outTunnel=new PrintWriter(soc.getOutputStream(),true);
            outTunnel.println(number);



        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}

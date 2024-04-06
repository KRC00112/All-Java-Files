import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {


        try {


            Socket soc = new Socket("localhost", 6666);
            System.out.println("Client connected");

            do {
                BufferedReader inTunnel = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                String enterPrompt = inTunnel.readLine();
                System.out.print(enterPrompt);
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                String num = input.readLine();
                PrintWriter outTunnel = new PrintWriter(soc.getOutputStream(), true);
                outTunnel.println(num);

                String result = inTunnel.readLine();
                System.out.println(result);

            }while(true);












        }
        catch (Exception e){
            e.printStackTrace();
        }





    }



}

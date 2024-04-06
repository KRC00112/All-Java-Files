import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.Buffer;

public class Client {

    public static void main(String[] args){


        try {
            Socket soc = new Socket("localhost", 1024);
            System.out.println("Client Connected");



            BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Talk: ");
            String msg=input.readLine();

            PrintWriter outTunnel=new PrintWriter(soc.getOutputStream(),true);
            outTunnel.println(msg);

            BufferedReader inTunnel=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String serverMsg=inTunnel.readLine();

            System.out.println("Server Says: "+serverMsg);

            if(serverMsg.equalsIgnoreCase("hello")){

                String limit= inTunnel.readLine();
                int intLimit=Integer.parseInt(limit);

                for(int i=0;i<intLimit;i++){

                    String menu=inTunnel.readLine();
                    System.out.print("\n"+menu+" ");
                }

                String selection= input.readLine();
                outTunnel.println(selection);
                String confirm= inTunnel.readLine();
                System.out.println(confirm);
                String promptNum1= inTunnel.readLine();
                System.out.print(promptNum1);
                String num1= input.readLine();
                outTunnel.println(num1);
                String promptNum2= inTunnel.readLine();
                System.out.print(promptNum2);
                String num2= input.readLine();
                outTunnel.println(num2);
                String result=inTunnel.readLine();
                System.out.println(result);

            }

        }
        catch (Exception e){
            e.printStackTrace();
        }



    }


}

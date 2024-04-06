import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {



    public static void main(String[] args){


        try {
            System.out.println("Awaiting Response...");
            ServerSocket ss = new ServerSocket(6666);
            Socket soc = ss.accept();
            System.out.println("Connection Established.");

            do{
                PrintWriter outTunnel = new PrintWriter(soc.getOutputStream(), true);
                outTunnel.println("Enter a number: ");

                BufferedReader inTunnel = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                String num = inTunnel.readLine();

                int i = 0;
                int intNum = Integer.parseInt(num);

                for (i = 2; i <= intNum - 1; i++) {

                    if (intNum % i == 0) {

                        break;
                    }


                }


                if (i == intNum) {


                    System.out.println(intNum + " is prime.");
                    outTunnel.println(intNum + " is prime.");


                } else {
                    System.out.println(intNum + " is not prime.");
                    outTunnel.println(intNum + " is not prime.");
                }



            }while(true);



        }

        catch (Exception e){
            e.printStackTrace();
        }










    }




}

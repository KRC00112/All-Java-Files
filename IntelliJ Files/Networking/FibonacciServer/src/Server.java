import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Server {

    public static void main(String[] args) {


        try {
            System.out.println("Awaiting Response...");
            ServerSocket ss = new ServerSocket(9087);
            Socket soc = ss.accept();
            System.out.println("Connection Established.");

            while(true) {

                LinkedList<Integer> ll = new LinkedList<Integer>();


                PrintWriter outTunnel = new PrintWriter(soc.getOutputStream(), true);
                outTunnel.println("Enter how many numbers in the series you want: ");

                BufferedReader inTunnel = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                String num = inTunnel.readLine();

                int intNum = Integer.parseInt(num);


                if (intNum == 1) {


                    ll.add(0);

                }
                if (intNum == 2) {

                    ll.add(0);
                    ll.add(1);

                }
                if (intNum > 2) {

                    intNum = intNum - 1;

                    ll.add(0);
                    ll.add(1);

                    int num1 = 0;
                    int num2 = 1;
                    int num3 = 0;

                    for (int i = 2; i <= intNum; i++) {

                        num3 = num2 + num1;




                        ll.add(num3);

                        num1 = num2;
                        num2 = num3;


                    }


                }

                System.out.println(ll);

                outTunnel.println(ll);

            }





        }
        catch (Exception e){
            e.printStackTrace();
        }



    }

}

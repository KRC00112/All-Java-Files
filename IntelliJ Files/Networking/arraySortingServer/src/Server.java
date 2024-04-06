import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Arrays;

public class Server {

    public static void main(String[] args){


        try {
            System.out.println("Waiting for connection...");
            ServerSocket ss = new ServerSocket(1234);
            Socket soc = ss.accept();
            System.out.println("Connection Established.");


            BufferedReader inTunnel=new BufferedReader(new InputStreamReader(soc.getInputStream()));

            int[] array=new int[8];

            for(int i=0;i<8;i++){
                String num=inTunnel.readLine();
                int intNum=Integer.parseInt(num);


                array[i]=intNum;

                System.out.println(array[i]);


            }


            Arrays.sort(array);

            System.out.print("The sorted Array: ");
            String x="";

            for(int i: array){
                x=x+i+" ";
            }

            System.out.print(x);

            PrintWriter outTunnel=new PrintWriter(soc.getOutputStream(),true);
            outTunnel.println(x);



        }
        catch (Exception e){
            e.printStackTrace();
        }




    }


}

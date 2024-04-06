import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.Buffer;

public class Client {


    public static void main(String[] args){


        try {
            System.out.println("Client Connected");
            Socket soc = new Socket("localhost", 1024);

            int[] array=new int[8];
            BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Eight numbers: ");

            for(int i=0;i<8;i++){

                String inputString=input.readLine();
                int inputNum=Integer.parseInt(inputString);

                array[i]=inputNum;


                PrintWriter outTunnel=new PrintWriter(soc.getOutputStream(),true);
                outTunnel.println(array[i]);



            }









        }
        catch (Exception e){
            e.printStackTrace();
        }





    }


}

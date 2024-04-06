import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args){


        try {
            System.out.println("Client Connected");
            Socket soc = new Socket("localhost", 1234);


            BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter numbers: ");
            int[] array=new int[8];

            for(int i=0;i<8;i++){

                String StringNum=input.readLine();
                int num=Integer.parseInt(StringNum);
                array[i]=num;

                PrintWriter outTunnel=new PrintWriter(soc.getOutputStream(),true);
                outTunnel.println(array[i]);



            }
            BufferedReader inTunnel=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String sortedArray=inTunnel.readLine();
            System.out.println("The sorted Array from the Server: "+sortedArray );



        }
        catch (Exception e){
            e.printStackTrace();
        }






    }

}

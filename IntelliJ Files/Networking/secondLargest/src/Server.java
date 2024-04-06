import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {

    public static void main(String[] args){


        try {
            System.out.println("Awaiting Response...");
            ServerSocket ss = new ServerSocket(1024);
            Socket soc = ss.accept();
            System.out.println("Connection Established.");

            BufferedReader inTunnel=new BufferedReader(new InputStreamReader(soc.getInputStream()));

            int[] array=new int[8];

            for(int i=0;i<8;i++){

                String inputString=inTunnel.readLine();
                int inputNum=Integer.parseInt(inputString);

                array[i]=inputNum;



            }


            Arrays.sort(array);
            System.out.print("The sorted array: ");

            for(int i:array){
                System.out.print(i+" ");
            }

            System.out.println();
            System.out.println("The Second Largest Element in the array is: "+array[array.length-2]);




        }
        catch (Exception e){
            e.printStackTrace();
        }



    }

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args){


        try {
            System.out.println("Awaiting Connection...");
            ServerSocket ss = new ServerSocket(1024);
            Socket soc = ss.accept();
            System.out.println("Connection Established.");

            BufferedReader inTunnel=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String words=inTunnel.readLine();


            System.out.println("ascii values of the characters in "+words+" are as such: ");

            for (int i=0;i<words.length();i++){

                char x=words.charAt(i);

                System.out.println(x+" = "+(int)x);

            }



        }
        catch (Exception e){
            e.printStackTrace();
        }






    }


}

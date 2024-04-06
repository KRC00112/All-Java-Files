import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {

        try {
            System.out.println("Awaiting Clients...");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc=ss.accept();
            System.out.println("Connection Established.");



                BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
                System.out.println("Client says: " + in.readLine());
                BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter a String: ");
                String str = serverInput.readLine();
                PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
                out.println(str);
                String number=in.readLine();
                int intNumber=Integer.parseInt(number);

                long num=intNumber;
                long originalNum=num;
                long prev=num-1;


                for(long i=intNumber;i>1;i--){



                    num=num*prev;

                    prev--;


                }



                System.out.println(originalNum+"! = "+num);





        }
        catch (Exception e){
            e.printStackTrace();
        }




    }

}

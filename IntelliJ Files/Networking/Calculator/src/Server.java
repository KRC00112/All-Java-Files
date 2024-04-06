import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args){

        try {
            System.out.println("Awaiting response...");
            ServerSocket ss = new ServerSocket(1024);
            Socket soc = ss.accept();
            System.out.println("Connection Established.");


            BufferedReader inTunnel=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String clientMsg=inTunnel.readLine();

            System.out.println("Client Says: "+clientMsg);


            if(clientMsg.equalsIgnoreCase("hi")) {

                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Talk: ");
                String msg = input.readLine();

                PrintWriter outTunnel = new PrintWriter(soc.getOutputStream(), true);
                outTunnel.println(msg);

                String[] menu= {"Menu","1. Addition","2. Subtraction","3. Multiplication","4. Division","Please enter your choice (1-4):"};
                outTunnel.println(menu.length);

                for(int i=0;i< menu.length;i++){

                    outTunnel.println(menu[i]);

                }

                String selection= inTunnel.readLine();
                int intSelection=Integer.parseInt(selection);

                String confirm="";

                if(intSelection==1){


                    outTunnel.println("you picked addition");
                    outTunnel.println("Enter num 1: ");
                    String num1= inTunnel.readLine();
                    outTunnel.println("Enter num 2: ");
                    String num2= inTunnel.readLine();
                    int intNum1=Integer.parseInt(num1);
                    int intNum2=Integer.parseInt(num2);
                    int result=intNum1+intNum2;
                    System.out.println(intNum1+" + "+intNum2+" = "+result);
                    outTunnel.println(intNum1+" + "+intNum2+" = "+result);


                }
                else if(intSelection==2){


                    outTunnel.println("you picked subtraction");
                    outTunnel.println("Enter num 1: ");
                    String num1= inTunnel.readLine();
                    outTunnel.println("Enter num 2: ");
                    String num2= inTunnel.readLine();
                    int intNum1=Integer.parseInt(num1);
                    int intNum2=Integer.parseInt(num2);
                    int result=intNum1-intNum2;
                    System.out.println(intNum1+" - "+intNum2+" = "+result);
                    outTunnel.println(intNum1+" - "+intNum2+" = "+result);


                }
                else if(intSelection==3){


                    outTunnel.println("you picked multiplication");
                    outTunnel.println("Enter num 1: ");
                    String num1= inTunnel.readLine();
                    outTunnel.println("Enter num 2: ");
                    String num2= inTunnel.readLine();
                    int intNum1=Integer.parseInt(num1);
                    int intNum2=Integer.parseInt(num2);
                    int result=intNum1*intNum2;
                    System.out.println(intNum1+" x "+intNum2+" = "+result);
                    outTunnel.println(intNum1+" x "+intNum2+" = "+result);


                }
                else if(intSelection==4){

                    outTunnel.println("you picked division");
                    outTunnel.println("Enter num 1: ");
                    String num1= inTunnel.readLine();
                    outTunnel.println("Enter num 2: ");
                    String num2= inTunnel.readLine();
                    int intNum1=Integer.parseInt(num1);
                    int intNum2=Integer.parseInt(num2);
                    double result=(double)intNum1/intNum2;
                    System.out.println(intNum1+" / "+intNum2+" = "+result);
                    outTunnel.println(intNum1+" / "+intNum2+" = "+result);


                }


            }

        }
        catch (Exception e){
            e.printStackTrace();
        }



    }

}

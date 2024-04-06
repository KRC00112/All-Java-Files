// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] menu= {"Menu","Addition","Subtraction","Multiplication","Division","Please enter your choice (1-4):"};

        int flag=0;


        for(int i=0;i<menu.length;i++){




            if(i==0||i==5){

               flag=1;

            }

            if(i==1||i==2||i==3||i==4){
                flag=0;

            }




            if(flag==0) {
                System.out.println((i + 1) + "." + menu[i]);

            }

            else if(flag==1){

                System.out.println(menu[i]);


            }






        }
    }
}
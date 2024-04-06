import java.util.Scanner;

public class number15 {

//    15. Write a program to swap 2 numbers by using user a defined
//    function.
    public number15(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x=scanner.nextInt();
        int y=scanner.nextInt();

        System.out.println("Before swap: ");
        System.out.println("x: "+x+"\ny: "+y);

        swap(x,y);






    }

    public void swap(int x,int y){

        int temp=x;
        x=y;
        y=temp;


        System.out.println("After swap: ");
        System.out.println("x: "+x+"\ny: "+y);


    }

}

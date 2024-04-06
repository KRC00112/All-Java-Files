// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



//       Algorithm:
//
//        int fNum=0;
//        int sNum=1;
//        int tNum=0;
//        int foNum;
//        int fiNum;
//
//
//
//        tNum=sNum+fNum;
//
//        foNum=tNum+sNum;
//
//        System.out.println(foNum);
//        fiNum=foNum+tNum;
//
//        System.out.println(fiNum);



        int num1=0;
        int num2=1;
        int j=0;

        int num3;

        int input=6;
        input=input-2;

        System.out.println(num1+"\n"+num2);
        for(int i=0;i<input;i++) {

            num3 = num2 + num1;

            System.out.println(num3);
            num1 = num2;
            num2 = num3;



        }




    }
}
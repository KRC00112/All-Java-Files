// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(9));
    }

    public static boolean isPowerOfThree(long n) {
        boolean isPow=false;
        for(int i=0;i<20;i++){
            if(((long)power(3,i))==n){
                isPow=true;
                break;
            }
            else{
                isPow=false;
            }
        }
        return isPow;
    }

    public static int power(int a,int b){
        int temp=a;
        if(b==0){
            a=1;
        }
        else if(b<0){
            a=0;
        }
        else if(b>0) {
            for (int i = 1; i < b; i++) {
                a = a * temp;
            }
        }
        return a;
    }
}
public class test {

    public static void main(String[] args) {

        System.out.println(power(3,9));
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

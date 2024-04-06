import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
    public static List<String> fizzBuzz(int n) {
        n=n+1;
        ArrayList<String> numbers=new ArrayList<>();
        for(int i=1;i<n;i++){
            String stringI=String.valueOf(i);
            numbers.add(stringI);
        }
        for(int i=0;i< numbers.size();i++){
            int num=Integer.parseInt(numbers.get(i));
            if(num%3==0){
                numbers.set(i,"Fizz");
            }
            if(num%5==0){
                numbers.set(i,"Buzz");
            }
            if(num%3==0&&num%5==0){
                numbers.set(i,"FizzBuzz");
            }
        }
        return numbers;
    }
}
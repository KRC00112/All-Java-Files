package rough;

public class Main {

    public static void main(String[] args) {

        int x = 2;
        int product = 1;
        int n = 5;
        
        // Print the initial value of product (2^0 = 1)
        System.out.println(product);

        for (int i = 1; i <= n; i++) {
            product *= x;
            System.out.println(product);
        }
    }
}

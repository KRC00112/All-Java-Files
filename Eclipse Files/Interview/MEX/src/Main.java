import java.util.*;

public class Main {
    public static int getMaximumMEX(List<Integer> arr) {

    	
    	Collections.sort(arr);
        
        int mex = 0;
        for (int num : arr) {
            if (num == mex) {
                mex++;
            } else if (num > mex) {
                break;
            }
        }
        
        return mex;
    }
    
    public static void main(String[]args) {
    	
    	List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        
        int maxMex = Main.getMaximumMEX(arr);
        System.out.println("Maximum MEX: " + maxMex);
    	
    }
    
    
    
}

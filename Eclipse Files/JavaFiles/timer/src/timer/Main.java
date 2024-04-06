package timer;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
public class Main {
    public static void main(String[] args) {
        Timer T = new Timer();
        TimerTask Birthday = new TimerTask(){
            int i = 5;
            @Override
            public void run(){
                if(i>0){
                    System.out.println(i);
                    i--;
                }
                else{
                    System.out.println("Happy Birthday John Doe");
                    T.cancel();
                }
            }
        };
        Calendar date = Calendar.getInstance();
        date.set(2023, Calendar.OCTOBER, 25,9, 38, 0);
       T.scheduleAtFixedRate(Birthday, date.getTime(), 1000);
    }
}
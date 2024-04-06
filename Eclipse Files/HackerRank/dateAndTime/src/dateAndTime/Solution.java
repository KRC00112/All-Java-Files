package dateAndTime;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	
//    	 int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
//         if (month < 3) {
//             year--;
//         }
//         
//         int x= (year + year / 4 - year / 100 + year / 400 + t[month - 1]+ day) % 7;
//         String a = null;
//         
//       if(x==0) {a="SUNDAY";System.out.println(a);}
//       else if(x==1) {a="MONDAY";System.out.println(a);}
//       else if(x==2) {a="TUESDAY";System.out.println(a);}
//       else if(x==3) {a="WEDNESDAY";System.out.println(a);}
//       else if(x==4) {a="THURSDAY";System.out.println(a);}
//       else if(x==5) {a="FRIDAY";System.out.println(a);}
//       else if(x==6) {a="SATURDAY";System.out.println(a);}
//       
//       return a;
//       
    	LocalDate localDate = LocalDate.of(month,day ,year);
        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("Day of week in text:"+dayOfWeek.toString());

       return dayOfWeek.toString();
       
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
	}
}

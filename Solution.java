import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
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
        int res = day + 6 + (year % 100) % 7 + (year % 100) / 4;
        if(month == 1) res += 1;
        else if(month == 2) res += 4;
        else if(month == 3) res += 4;
        else if(month == 4) res += 0;
        else if(month == 5) res += 2;
        else if(month == 6) res += 5;
        else if(month == 7) res += 0;
        else if(month == 8) res += 3;
        else if(month == 9) res += 6;
        else if(month == 10) res += 1;
        else if(month == 11) res += 4;
        else res += 6;

        res %= 7;

        if(res == 0) return "SATURDAY";
        else if(res == 1) return "SUNDAY";
        else if(res == 2) return "MONDAY";
        else if(res == 3) return "TUESDAY";
        else if(res == 4) return "WEDNESDAY";
        else if(res == 5) return "THURSDAY";
        else return "FRIDAY";
    }

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

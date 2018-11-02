package interviewpreparationkit.RecursionandBacktracking;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DavisStaircase {
    private static Map<Integer, Integer> map = new HashMap<>();
    // Complete the stepPerms function below.
    static int stepPerms(int n) {
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(!map.containsKey(n)) {
            int count = stepPerms(n-1) + stepPerms(n-2) + stepPerms(n-3);
            map.put(n, count);
        }
        return map.get(n);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int sItr = 0; sItr < s; sItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int res = stepPerms(n);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

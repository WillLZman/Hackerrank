package interviewpreparationkit.DictionariesandHashmaps;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        //each note string must occur in magazine and only once, cases matter
        //TODO Brute force apporach takes too long think again in the morning
        boolean stringMatch = false;
        boolean countMatch = true;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < note.length; i++) {
            int count = 0;
            for (int j = 0; j < magazine.length; ) {
                if (note[i] == magazine[j]) {
                    stringMatch = true;
                    count++;
                }
                hashMap.put(j, count);
            }
        }
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            if (Integer.valueOf((String) entry.getValue()) > 1) {
                countMatch =false;
            }
        }
        if ((stringMatch && countMatch) ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}

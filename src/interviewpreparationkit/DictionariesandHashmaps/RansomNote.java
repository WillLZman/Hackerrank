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
        HashMap<String, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < magazine.length; i++) {
            if (magazineMap.containsKey(magazine[i])){
                magazineMap.put(magazine[i],magazineMap.get(magazine[i])+1);
            }else {
            magazineMap.put(magazine[i],1);
            }
        }
        for (int i = 0; i < note.length; i++){
            if (magazineMap.keySet().contains(note[i]) && magazineMap.get(note[i])>0){
                magazineMap.put(note[i],magazineMap.get(note[i])-1);
            }else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
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

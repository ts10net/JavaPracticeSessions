package main.hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubstringSmallestLargest {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        if (s == null) return null;
        if (s.length() <= k) smallest = largest = s;
        else {
            String temp;
            for (int i = 0; i <= s.length() - k; i++) {
                temp = s.substring(i, i + k);
                //System.out.println("temp: "+ temp);
                if (i == 0) {
                    smallest = largest = temp;
                } else {
                    if (isGreater(smallest, temp)) {
                        // temp is smaller than the one we already have
                        smallest = temp;
                    }

                    if (isGreater(temp, largest)) {
                        largest = temp;
                    }
                }

            }
        }

        return smallest + "\n" + largest;
    }


    private static boolean isGreater(String A, String B) {
        if (null == A || null == B) return false;
        char[] aArray = A.toCharArray();
        char[] bArray = B.toCharArray();
        for (int i = 0; i < A.length() && i < B.length(); i++) {
            if (aArray[i] == bArray[i]) continue;
            else if (aArray[i] > bArray[i]) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
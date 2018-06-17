package main.hackerRank;
import java.io.*;
import java.util.*;

/*
Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.

Sample Input 0
hello
java


Sample Output 0
9
No
Hello Java

Test case: ma mad
*/
public class Lexicographical {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println((null==A? 0: A.length() )+ (null==B?0:B.length()));
        System.out.println(isGreater(A, B)?"Yes":"No");
        System.out.println(properCase(A)+ ' ' + properCase(B));
    }

    private static String properCase(String str){
        if(null!=str && str.length()>0){
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return str;
    }

    private static boolean isGreater(String A, String B){
        if(null==A || null==B) return false;
        char[] aArray = A.toCharArray();
        char[] bArray = B.toCharArray();
        for(int i=0; i<A.length()&&i<B.length();i++){
            if(aArray[i] == bArray[i]) continue;
            else if(aArray[i]>bArray[i]){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}

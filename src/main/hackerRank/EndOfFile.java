package main.hackerRank;

import java.io.*;
import java.util.*;

/*
Sample Input

Hello world
I am a file
Read me until end-of-file.

Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.
 */
public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanIn = new Scanner(System.in);

        short line = 0;
        while(scanIn.hasNext()){
            System.out.println(++line + " "+ scanIn.nextLine());
        };
    }
}

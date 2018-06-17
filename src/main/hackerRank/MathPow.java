package main.hackerRank;
import java.util.*;
import java.io.*;


public class MathPow {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            String series = "";
            for(int count=0; count<n; count++){
                series += (a + method(b , count+1)) + " ";
            }
            System.out.println(series);
        }
        in.close();
    }

    private static int method(int b, int n){
        int val = 0;
        for(int j=0; j<n; j++) {
            val += (Math.pow(2, j))*b;
        }
        return val;
    }
}

/*
Test Case 1:
Input (stdin)

2
0 2 10
5 3 5
Your Output (stdout)

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Expected Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

Test Case 2:
Input (stdin)

3
3 3 3
0 0 5
6 6 10
Your Output (stdout)

6 12 24
0 0 0 0 0
12 24 48 96 192 384 768 1536 3072 6144
Expected Output

6 12 24
0 0 0 0 0
12 24 48 96 192 384 768 1536 3072 6144
 */

package main.series;

import java.util.ArrayList;
import java.util.HashMap;

public class Fibonacci {

    private int recursive(int n) {
        if (n == 0) return 0;

        if (n == 1 || n == 2) {
            return 1;
        } else {
            return recursive(n - 1) + recursive(n - 2);
        }
    }

    //private HashMap<Integer, Integer> memo = new HashMap<>();
    private int memoized(int n, HashMap<Integer, Integer> memo) {
        if (n == 0) return 0;

        if (n == 1 || n == 2) {
            return 1;
        }

        if (memo == null) {
            memo = new HashMap<>();
        }
        if (memo.get(n) != null) {
            return memo.get(n);
        } else {
            int result = memoized(n - 1, memo) + memoized(n - 2, memo);
            memo.put(n, result);
            return result;
        }
    }

    private int bottomUp(int n) {
        // also known as tabulation

        int[] fib = new int[n+1];
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        fib[0] = 0;
        fib[1] = 1;

        for(int i=2; i <=n; i++){
            fib[i] = fib[i-1] + fib[i-2];
            //System.out.print(fib[i] + " ");
        }

        return fib[n];
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        //long endTime = System.currentTimeMillis();
        Fibonacci fibonacci = new Fibonacci();
        int num = 25;

        System.out.println("Recursive...");
        for (int i = 0; i <= num; i++) {
            System.out.print(fibonacci.recursive(i) +" ");
        }
        //endTime = System.currentTimeMillis();

        System.out.println();
        long recursive = (System.nanoTime() - startTime);

        System.out.println("Memoized...");
        startTime = System.nanoTime();
        for (int i = 0; i <= num; i++) {
            System.out.print(fibonacci.memoized(i, new HashMap<>()) + " ");
        }
        long memoized = (System.nanoTime() - startTime);

        System.out.println();

        System.out.println("Bottom Up...");
        startTime = System.nanoTime();
        for (int i = 0; i <= num; i++) {
            System.out.print(fibonacci.bottomUp(i) + " ");
        }

        long bottomUp = (System.nanoTime() - startTime);

        System.out.println();
        System.out.println("Time taken recursive:"+ recursive);
        System.out.println("Time taken memoized:"+ memoized);
        System.out.println("Time taken bottomUp:"+ bottomUp);
    }
}

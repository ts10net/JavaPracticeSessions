package main.programs;

import java.util.Arrays;
import java.util.Collections;

public class Sort {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        Integer[] arr = {5, 7, 1, -2, 9, 55, 8};
        /*Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));*/

        System.out.println(System.identityHashCode(arr));
        System.out.println("sorting...");
        //Sort sort = new Sort();
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(Integer[] arr) {
        System.out.println(System.identityHashCode(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //return arr;
    }
}

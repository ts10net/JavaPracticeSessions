package main.sort;

import main.programs.Utils;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = Utils.randomizeArray(10);
        QuickSort sort = new QuickSort();
        System.out.println("Unsorted array:\n" + Arrays.toString(arr) + System.lineSeparator());
        System.out.println("\nSorted array:\n" + Arrays.toString(sort.quickSort(arr)));
    }

    private int[] quickSort(int[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    private int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = arr[(left + right) / 2];
            int index = partition(arr, left, right, pivot);
            System.out.println("left: " + arr[left] + ", right: " + arr[right] + ", pivot: " + pivot + ", index: " + index);
            quickSort(arr, left, index - 1);
            quickSort(arr, index, right);
        }

        return arr;
    }

    private int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                Utils.swap(arr, left, right);
                left++;
                right--;
            }
        }

        return left;
    }
}

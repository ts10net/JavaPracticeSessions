package main.search;

public class BinarySearch {

    private int binarySearch(int[] arr, int l, int r, int x) {
        if (r < 1) return -1;
        int mid = (l + (r-1))/2;
        if(arr[mid]==x) return mid;
        else if(arr[mid]>x) l = mid-1;
        else r = mid + 1;

        return binarySearch(arr, l, r, x);

    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        in.next()*/
        int[] arr = {1, -2, 6, 90, 33, 50, 135, 28};

        BinarySearch binarySearch = new BinarySearch();

        int index = binarySearch.binarySearch(arr, 0, arr.length - 1, 33);
        if (index < 0) System.out.println("Not found: ");
        else System.out.println("Found at: " + index);
    }
}

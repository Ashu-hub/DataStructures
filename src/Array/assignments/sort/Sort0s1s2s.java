package Array.assignments.sort;

/*
Array consist of only 0's, 1's and 2's.
Write an algorithm to sort  this array in O(n) time complexity and O(1) Space complexity with only one traversal.
*//*
1.BruteForce - Simple Counting method:
Take thress counters and count 0's 1's 2's and put them count wise in an array*/

//2. 3 - Way partitioning method

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int a[] = {2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sortIt(a, 0, a.length - 1);
    }

    private static void sortIt(int[] a, int low, int high) {
        int i = low;
        int j = high;
        int mid = low;

        while (mid <= high) {
            if (a[mid] == 2) {
                swap(a, mid, high);
                high--;
            } else if (a[mid] == 0) {
                swap(a, low, mid);
                low++;
                mid++;
            } else {
                mid++;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

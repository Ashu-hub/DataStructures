package Array.assignments.sort;

import java.util.Arrays;

import static Array.assignments.sort.Sort0s1s2s.swap;

/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements
        in O(n) Time complexity and O(1) Space complexity with single traversal allowed
input = 1 3 0 0 4 0 9
        |
        1 3 4 9 0 0 0
*/
public class Sort0sExtension {
    public static void main(String[] args) {
        int a[] = {1, 3, 0, 0, 4, 0, 9};
        sortItExtension(a, 0, a.length - 1);
    }

    private static void sortItExtension(int[] a, int low, int high) {
        while (low <= high) {
            if(a[low] == 0){
                swap(a, low, high);
                high--;
            }
            else
                low++;
        }
        System.out.println(Arrays.toString(a));
    }
}

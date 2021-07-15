package Array.assignments.sort;
/*
We rotate an ascending order sorted array at some point unknown to user.
So for instance,3 4 5 6 7 might become 5 6 7 3 4.
Modify binary search algorithm to find an element in the rotated array in O(log n)time and O(1)Space complexity
output = 3
*/

public class FindRotationPointInSortedArray {
    public static void main(String[] args) {
//        int[] a = {5, 6, 7, 3, 4};
        int[] a = {7, 8, 9, 10, 1, 2, 3, 4, 5, 6};
        System.out.println(findElement(a, 0, a.length - 1));
    }

    private static int findElement(int[] a, int low, int high) {
        if (low == high) {
            return a[low];
        }
        if (high == low + 1) {
            if (a[high] <= a[low])
                return a[high];
            else
                return a[low];
        }
        int mid = (low + high) / 2;

        if (a[mid] < a[mid + 1] && a[mid] < a[mid - 1]) {//desire result
            return a[mid];
        }
        if (a[mid] > a[mid + 1] && a[mid] > a[mid - 1]) {
            return findElement(a, mid + 1, high);
        } else {
            return findElement(a, 0, mid - 1);
        }
    }
}

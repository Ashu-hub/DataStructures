package Array.assignments.sort;

/*
We rotate an ascending order sorted array at some point unknown to user.
        So for instance,3 4 5 6 7 might become 5 6 7 3 4.
        Modify binary search algorithm to find an element in the rotated array in O(log n)time and O(1)Space complexity
find number 3 in desired Complexity
*/
public class FindNumberInRotatedSortedArray {
    public static void main(String[] args) {
        int a[] = {7, 8, 9, 10, 1, 2, 3, 4, 5, 6};
        int key = 4;
        System.out.println(findNumber(a, 0, a.length - 1, key));
    }

    private static int findNumber(int[] a, int low, int high, int key) {

        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (a[mid] == key)
            return mid;
        /*hint:
        First you need to find whether the mid is lying in left or right seq
        if(a[mid] > a[0]) -> left seq -> compare key wth a[0] accordingly search in left/right seq
        if(a[mid] < a[0]) -> right seq -> compare key with a[high] accordingly search in left/right seq
        */
        if (a[mid] >= a[low]) { //left seq or in 1st sorted list
            if (key >= a[low] && key <= a[mid]) {
                return findNumber(a, low, mid - 1, key);
            }
            return findNumber(a, mid + 1, high, key);
        } else { //right seq or in 2nd sorted list
            if (key >= a[mid] && key <= a[high])
                return findNumber(a, mid + 1, high, key);

            return findNumber(a, low, mid - 1, key);
        }
    }
}

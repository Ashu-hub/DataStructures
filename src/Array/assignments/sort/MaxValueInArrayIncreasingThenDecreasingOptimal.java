package Array.assignments.sort;
/*WAP to find max element in an Array which is increasing then decreasing in Log(n) time
a[] = {6,9,15,25,35,50,41,29,23,8}
output =  50
*/

//This solution time complexity is O(logn)
public class MaxValueInArrayIncreasingThenDecreasingOptimal {
    public static void main(String[] args) {
        int a[] = {6, 9, 15, 25, 35, 50, 41, 29, 23, 8};
        System.out.println(findMaxValue(a, 0, a.length - 1));
    }

    private static int findMaxValue(int[] a, int low, int high) {
        if (low == high) {
            return a[low];
        }

        if (low == high - 1) {
            if (a[low] >= a[high])
                return a[low];
            else
                return a[high];
        }
        int mid = (low + high) / 2;

        if (a[mid] > a[mid + 1] && a[mid] > a[mid - 1]) { //desired case
            return a[mid];
        }
        if (a[mid] > a[mid + 1] && a[mid] < a[mid - 1]) {
          return   findMaxValue(a, low, mid-1);
        } else {
            return findMaxValue(a, mid + 1, high);
        }
    }
}

package Array.assignments.sort;

/*WAP to find max element in an Array which is increasing then decreasing in Log(n) time
a[] = {6,9,15,25,35,50,41,29,23,8}
output =  50
*/

//This solution time complexity is O(n) with extra space.
public class MaxValueInArrayIncreasingThenDecreasingBruteForce {
    public static void main(String[] args) {
        int a[] = {6, 9, 15, 25, 35, 50, 41, 29, 23, 8};
        int mid = findMidPoint(a, a.length - 1);
        merge(a, 0, mid, a.length - 1);
    }

    private static void merge(int[] a, int low, int mid, int high) {
        int i = low;
        int k = low;
        int j = mid + 1;
        int b[] = new int[high+1];
        while (i <= mid && j <= high) {
            if (a[i] < a[j])
                b[k++] = a[i++];
            else
                b[k++] = a[j++];
        }
        while (i <= mid) {
            b[k++] = a[i++];
        }
        while (j <= high) {
            b[k++] = a[j++];
        }
        System.out.println("Max element is - " + b[b.length - 1]);
    }

    private static int findMidPoint(int[] a, int length) {
        for (int i = 0; i < length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return i;
            }
        }
        return 0;
    }
}

package Array.FindPairWithSumK;

/*Given an unsorted array of nonnegative integers, find a continuous subarray which adds to a given number.
* Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Ouptut: Sum found between indexes 2 and 4
* */
public class FindContiguousSubarrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        findSubArray(arr, sum);

    }

    private static void findSubArray(int[] arr, int sum) {
        int currSum = arr[0];
        int left = 0;
        int right = 0;

        do {
            if (currSum == sum) {
                System.out.println("Subarray index is :" + left + " to " + right);
                break;
            } else if (currSum < sum) {
                right++;
                currSum += arr[right];
            } else {
                currSum -= arr[left];
                left++;
            }
        } while (right != arr.length - 1 || left != arr.length - 1);
    }
}

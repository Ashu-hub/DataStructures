package Array.KandanesAlgo;

import java.util.stream.IntStream;

//Given a array, return number of way the left subarray is greater than right subarray
/*
 * arr = {10, 4 ,-8, 7};
 * Ans: 2
 */
public class ArraySplitting {

	public static void main(String[] args) {
		//int arr[] = { 10, 4, -8, 7 };
		int arr[] = { 10, -5, 6 };
		System.out.println(findArraySplitting(arr, arr.length));

	}

	private static int findArraySplitting(int[] arr, int length) {
		int totalSum = IntStream.of(arr).sum();
		int leftSum = 0;
		int rightSum = 0;
		int numofTimesLeftGreaterRight = 0;

		for (int i = 0; i < arr.length-1; i++) {
			leftSum += arr[i];
			rightSum = totalSum - leftSum;
			
			if (leftSum > rightSum) {
				numofTimesLeftGreaterRight++;
			}
		}

		return numofTimesLeftGreaterRight;
	}

}

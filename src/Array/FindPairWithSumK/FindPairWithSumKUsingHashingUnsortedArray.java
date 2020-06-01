package Array.FindPairWithSumK;

import java.util.Arrays;

public class FindPairWithSumKUsingHashingUnsortedArray {

	public static void main(String[] args) {
		int[] arr = { 6, 3, 8, 10, 16, 7, 5, 2, 9, 14 };
		int sum = 10;
		findPair(arr, sum);
	}

	private static void findPair(int[] arr, int sum) {
		int h = findMaxElement(arr);
		int b[] = new int[h + 1];

		for (int i = 0; i < arr.length; i++) {
			int indexPair = sum - arr[i];
			if (indexPair > 0 && b[indexPair] == 1) {
				System.out.println("Number which makes a piar is " + indexPair + " & " + arr[i]);
			}
			b[arr[i]]++;
		}
	}

	private static int findMaxElement(int[] arr) {
		return Arrays.stream(arr).max().getAsInt();
	}

}

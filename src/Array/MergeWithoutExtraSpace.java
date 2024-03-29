package Array;

import java.util.Arrays;

/*
 * Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order.
 *  Merge the two arrays into one sorted array in non-decreasing order without using any extra space.
	Example 1:
	
	Input:
	N = 4, M = 5
	arr1[] = {1, 3, 5, 7}
	arr2[] = {0, 2, 6, 8, 9}
	Output: 0 1 2 3 5 6 7 8 9
	Explanation: Since you can't use any 
	extra space, modify the given arrays
	to form 
	arr1[] = {0, 1, 2, 3}
	arr2[] = {5, 6, 7, 8, 9}
	
	Example 2:
	
	Input:
	N = 2, M = 3
	arr1[] = {10, 12}
	arr2[] = {5, 18, 20}
	Output: 5 10 12 18 20
	Explanation: Since you can't use any
	extra space, modify the given arrays
	to form 
	arr1[] = {5, 10}
	arr2[] = {12, 18, 20}
 */
public class MergeWithoutExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 0, 1, 2, 3 };
		int[] arr2 = { 5, 6, 7, 8, 9 };
		merge(arr1, arr2, 4, 5);
	}

	private static void merge(int[] arr1, int[] arr2, int n, int m) {
		// TODO Auto-generated method stub
		int j = 0, i = 0;
		while (i < n) {
			if (arr1[i] > arr2[j]) {
				// swap(arr1[i], arr2[j]);
				int temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;
				j++;
			} else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}

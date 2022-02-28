package Array;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1#
//Solution : https://www.youtube.com/watch?v=29uyA4F9t5I
/*
 * Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by increasing or decreasing them by K only once. After modifying, height should be a non-negative integer. 
	Find out the minimum possible difference of the height of shortest and longest towers after you have modified each tower.
	
	You can find a slight modification of the problem here.
	Note: It is compulsory to increase or decrease (if possible) by K to each tower.
	
	Example 1:
	Input:
	K = 2, N = 4
	Arr[] = {1, 5, 8, 10}
	Output:
	5
	Explanation:
	The array can be modified as 
	{3, 3, 6, 8}. The difference between 
	the largest and the smallest is 8-3 = 5.
	
	Example 2:
	Input:
	K = 3, N = 5
	Arr[] = {3, 9, 12, 16, 20}
	Output:
	11
	Explanation:
	The array can be modified as
	{6, 12, 9, 13, 17}. The difference between 
	the largest and the smallest is 17-6 = 11. 

 */
public class MinimizeTheHeights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 9, 12, 16, 20 };
		int k = 3;
		System.out.println(getMinDiff(arr, arr.length, k));
	}

	static int getMinDiff(int[] arr, int n, int k) {

		int min = 0, max = 0, r = 0;
		Arrays.sort(arr);
		r = arr[n - 1] - arr[0];

		for (int i = 1; i < n; i++) {
			if (arr[i] >= k) {
				max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
				min = Math.min(arr[i] - k, arr[0] + k);

				r = Math.min(r, max - min);
			}
		}
		return r;
	}

}

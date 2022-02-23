package Microsoft.Array;

import java.util.HashSet;
import java.util.Set;

public class LargestKsuchthatbothKandMinusKexistinarray {
/*	Write a function that, given an array A of N integers, returns the lagest integer K > 0 such that both values K and -K exist in array A. If there is no such integer, the function should return 0.

			Example 1:

			Input: [3, 2, -2, 5, -3]
			Output: 3
			Example 2:

			Input: [1, 2, 3, -4]
			Output: 0
			
			*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, -4};
		System.out.println(findLargestK(arr));
	}

	private static int findLargestK(int[] arr) {
		Set<Integer> set = new HashSet<>();
		int currMax = 0;
		for (int a : arr) {
			if (set.contains(a * -1)) {
				currMax = Math.max(currMax, Math.abs(a));
			} else {
				set.add(a);
			}
		}
		return currMax;
	}

}

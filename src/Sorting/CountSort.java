package Sorting;

import java.util.Arrays;
//Time Complexit is 0(n)
//Space Complexity = 0(n+r); r bring the range of data
public class CountSort {

	public static void main(String[] args) {
		int a[] = { 6, 3, 9, 10, 15, 6, 8, 12, 3, 6 };
		cSort(a, a.length );
		System.out.println(Arrays.toString(a));
	}

	private static void cSort(int[] a, int n) {
		int max = findMax(a);
		int c[] = new int[max + 1];
		
		for (int i = 0; i < n; i++) {
			c[a[i]]++;
		}
		int i = 0, j = 0; // j is for original array ,i is for big aux array.

		while (i < max+1) {

			if (c[i] > 0) {
				a[j++] = i;
				c[i]--;
			} else {
				i++;
			}
		}
	}

	private static int findMax(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

}

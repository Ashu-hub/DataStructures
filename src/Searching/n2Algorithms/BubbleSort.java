package Searching.n2Algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int A[] = { 3, 7, 9, 10, 6, 5, 12, 4, 11, 2 };
		System.out.println(Arrays.toString(A));

		BubbleSort.BSort(A, A.length);
		System.out.println(Arrays.toString(A));
	}

	private static void BSort(int[] a, int n) {
		int temp;
		int flag =0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < (n - 1 - i); j++) {
				if (a[j] > a[j + 1]) { // for descending order change > to <
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;
				}
			}
			if(flag == 0) {
				return;
			}
		}
	}

}/*
Analysis:-
* Number for Comparisons - 0(n2)
* Number of Swaps- max= n-1; minimun =0
* Adaptive- Min time - 0(n)
* Stable = Yes.  the order is not change in case of repeated elements.

*/
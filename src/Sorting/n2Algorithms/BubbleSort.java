package Sorting.n2Algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int A[] = { 3, 1, 9, 10, 6, 5, 12, 4, 11, 2 };
		System.out.println(Arrays.toString(A));

		BubbleSort.BSort(A, A.length);
		System.out.println(Arrays.toString(A));
	}

	private static void BSort(int[] a, int length) {
		for (int i = 0; i < a.length - 1; i++) {// -1 as we need to compare 2nd last and last element
			boolean swapped = false;
			for (int j = 0; j < a.length - 1 - i; j++) {// -i as the last element is already sorted after 2st pass. need
														// not to check
				if (a[j + 1] < a[j]) {
					// swap it
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
					swapped = true; // indicates that a swapping happens and given array requires swapping
				}
			}
			if (!swapped) {// this way we can optimized the code in case of given array is already sorted.
				return;
			}
		}

	}

	/*
	 * private static void BSort(int[] a, int n) { int temp; int flag =0; for (int i
	 * = 0; i < n - 1; i++) { for (int j = 0; j < (n - 1 - i); j++) { if (a[j] > a[j
	 * + 1]) { // for descending order change > to < temp = a[j]; a[j] = a[j + 1];
	 * a[j + 1] = temp; flag = 1; } } if(flag == 0) { return; } } }
	 */

}/*
	 * Concept: Compare adjacent element and swap if next position element is
	 * greater. Continue for every element. The bubble sort gets its name because
	 * elements tend to move up into the correct order like bubbles rising to the
	 * surface. Analysis:- Number for Comparisons - 0(n2) Number of Swaps- max= n-1;
	 * minimun =0 Adaptive- Min time - 0(n) Stable = Yes. the order is not change in
	 * case of repeated elements.
	 * 
	 */
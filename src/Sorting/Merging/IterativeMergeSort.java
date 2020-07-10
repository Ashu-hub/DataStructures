package Sorting.Merging;

import java.util.Arrays;

public class IterativeMergeSort {

	public static void main(String[] args) {
		int a[] = { 8, 3, 7, 4, 9, 2, 6, 5 };
		iMergeSort(a, a.length);
		System.out.println(Arrays.toString(a));
	}

	private static void iMergeSort(int[] a, int n) {
		int p;
		for (p = 2; p <= n; p = p * 2) {
			for (int i = 0; i + p - 1 < n; i = i + p) {
				
				int low = i;
				int high = i + p - 1;
				int mid = (low + high) / 2;
				merge(a, low, mid, high);
			}
		}
		if (p / 2 < n) {
			merge(a, 0, p / 2 - 1, n - 1);
		}
	}

	public static void merge(int[] a, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = low;

		int[] b = new int[high + 1]; // Auxilary Array
		while (i <= mid && j <= high) {
			if (a[i] < a[j]) {
				b[k++] = a[i++];
			} else {
				b[k++] = a[j++];
			}
		}
		while (i <= mid) {
			b[k++] = a[i++];
		}
		while (j <= high) {
			b[k++] = a[j++];
		}

		for (int m = low; m <= high; m++) {
			a[m] = b[m];
		}
	}
}

package Sorting.Merging;

import java.util.Arrays;
//Time Complexity = nlogn
//Space COmplexity = n+logn(Extra Space.)
public class RecursiveMergeSort {

	public static void main(String[] args) {
		int a[] = { 8, 2, 9, 6, 5, 3, 7, 4 };
		rMergeSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	private static void rMergeSort(int[] a, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			rMergeSort(a, low, mid);// left part
			rMergeSort(a, mid + 1, high); // right part
			merge(a, low, mid, high);
		}

	}

	private static void merge(int[] a, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = low;
		int b[] = new int[high + 1];
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
		for (int p = low; p <= high; p++) {
			a[p] = b[p];
		}
	}

}

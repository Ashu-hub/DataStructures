package Sorting.Merging;

import java.util.Arrays;

public class Merging2SortedListSameArray {

	public static void main(String[] args) {
		int a[] = { 2, 5, 8, 12, 3, 6, 7, 10 };// this Contains 2 sorted list from index = 4
		int mid = (a.length - 1) / 2;
		merge(a, 0, mid, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	public static void merge(int[] a, int l, int mid, int h) {
		int i = l;
		int j = mid + 1;
		int k = l;

		int[] b = new int[h + 1]; // Auxilary Array
		while (i <= mid && j <= h) {
			if (a[i] < a[j]) {
				b[k++] = a[i++];
			} else {
				b[k++] = a[j++];
			}
		}
		while (i <= mid) {
			b[k++] = a[i++];
		}
		while (j <= h) {
			b[k++] = a[j++];
		}

		for (int m = l; m <= h; m++) {
			a[m] = b[m];
		}
	}

}

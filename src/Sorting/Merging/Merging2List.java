package Sorting.Merging;

import java.util.Arrays;

//Merge 2 sorted List into 1 list
public class Merging2List {

	public static void main(String[] args) {
		int a[] = { 2, 10, 18, 20, 23 };
		int b[] = { 4, 9, 19, 25 };

		merge(a, b);

	}

	private static void merge(int[] a, int[] b) {
		int c[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}
		}
		while (i < a.length) {
			c[k++] = a[i++];
		}
		while (j < b.length) {
			c[k++] = b[j++];
		}

		System.out.println(Arrays.toString(c));
	}

}

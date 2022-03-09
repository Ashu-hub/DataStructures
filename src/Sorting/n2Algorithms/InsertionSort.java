package Sorting.n2Algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int A[] = { 13, 7, 9, 10, 6, 5, 12, 4, 11, 2 };
		System.out.println(Arrays.toString(A));

		InsertionSort.insertSort(A, A.length);
		System.out.println(Arrays.toString(A));

	}

	private static void insertSort(int[] a, int length) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i]; 
			int j = i - 1; 
			while (j > -1 && a[j] > temp) {
				a[j + 1] = a[j]; 
				j--;
			}
			a[j + 1] = temp;

		}
	}

	/*
	 * private static void insertSort(int[] a, int n) { for (int i = 1; i <
	 * a.length; i++) { int j = i - 1; int temp = a[i]; while (j > -1 && a[j] >
	 * temp) { a[j + 1] = a[j]; j--; } a[j + 1] = temp; } }
	 */

}
/*
 * REf: https://www.youtube.com/watch?v=wWhAhp6PIuQ Concept:- It assumes a array
 * has 2 parts- sorted and unsorted part. Pick a element from unsorted part and
 * insert into sorted part at correct position. Starts with only one element and
 * assumes that it is sorted. Start Inserting and element in a sorted position
 * in a sorted Array. In Array Start shifting and comparing the element, once it
 * become smaller insert it there. In LInked List , we dn't need to shift, just
 * insert at right position.
 * 
 * Analysis:- Insertion sort is best suited for Linked list as there is not
 * shifting . Number for Comparisons - 0(n2) Number of Swaps- max= n-1;minimun =
 * 0 Adaptive- Min time - 0(n) (if list is already sorted), By natureis Adative.
 * Stable = Yes. the order is not change in case of repeated elements.
 */

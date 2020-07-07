package Searching.n2Algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int A[] = { 3, 7, 9, 10, 6, 5, 12, 4, 11, 2 };
		System.out.println(Arrays.toString(A));

		InsertionSort.insertSort(A, A.length);
		System.out.println(Arrays.toString(A));

	}

	private static void insertSort(int[] a, int n) {
		for (int i = 1; i < a.length; i++) {
			int j = i - 1;
			int x = a[i];
			while (j > -1 && a[j] > x) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = x;
		}
	}

}
/*
 * Concept:- Inserting and element in a sorted position in a sorted Array
 * In Array Start shifting and comparing the element, once it become smaller insert it there.
 * In LInked List , we dn't need to shift, just insert at right position.
 * Analysis:- Insertion sort is best suited for Linked list as there is not
 * shifting .
 * Number for Comparisons - 0(n2) 
 * Number of Swaps- max= n-1; minimun = 0
 * Adaptive- Min time - 0(n) (if list is already sorted), By nature is Adative. 
 * Stable = Yes. the order is not change in case of
 * repeated elements.
 */

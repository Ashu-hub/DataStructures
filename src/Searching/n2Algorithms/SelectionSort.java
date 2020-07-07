package Searching.n2Algorithms;

import java.util.Arrays;
//Concept:- We select an index/position and find out the element for the that position.
//Like we select 0th index and find the smallest element for that 0th Element.
//TC- O(n2)
public class SelectionSort {

	public static void main(String[] args) {
		int A[] = { 3, 7, 9, 10, 6, 5, 12, 4, 11, 2 };
		sSort(A, A.length);
		System.out.println(Arrays.toString(A));
	}

	private static void sSort(int[] a, int n) {
		int k;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = k = i; j < a.length; j++) {
				if (a[j] < a[k]) {
					k = j;
				}
			}
			//swap i with k
			int temp = a[k];
			a[k] = a[i];
			a[i] = temp;
		}

	}

}

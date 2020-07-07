package Searching.nlognAlgorithms;

import java.util.Arrays;

public class QuickSorting {
	// Concept:- First partition
	public static void main(String[] args) {
		int[] a = { 50, 70, 60, 90, 40, 0, 10, 20, 32677 };
		System.out.println(Arrays.toString(a));
		QuickSort(a, 0, a.length);
		System.out.println(Arrays.toString(a));

	}

	private static void QuickSort(int[] A, int low, int high) {
		int p;
		if (low < high) {
			 p = partitioning(A, low, high); // A[p] in sorted position
			QuickSort(A, low, p - 1); // Sort elements in range: A[low], A[p-1]
			QuickSort(A, p + 1, high); // Sort elements in range: A[p+1], A[high]
		}

	}

	private static int partitioning(int[] a, int low, int high) {
		int pivot = a[low];
		int j = high, i = low;
		// { 50, 70, 60, 90, 40, 0, 10, 20 }
		do {
			// Increment i as long as elements are smaller/equal to pivot
			do {
				i++;
			} while (a[i] > pivot);

			// Decrement j as long as elements are larger than pivot
			do {
				j--;
			} while (a[j] <= pivot);
			
			if (i < j) {
				swap(a[i], a[j]);
			}
		} while (i < j);
		swap(pivot, a[j]);
		
		return j;
	}

	private static void swap(int i, int j) {
		int temp;
		temp = i;
		i = j;
		j = temp;
	}

}

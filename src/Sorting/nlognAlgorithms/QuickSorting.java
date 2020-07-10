package Sorting.nlognAlgorithms;
//Quick sort is called - Partition Exchange sort or Selection Exchange sort 
import java.util.Arrays;
//Analaysis:-
//Timecomplexity(Worst Case) - 0(n2), i.e if the list is already sorted.
//Timecomplexity(Average/Best Case) = 0(nlogn)

//Space Complexity - 0(1)- In place (i.e. it doesn’t require any extra storage)
public class QuickSorting {
	// Concept:- First partition
	public static void main(String[] args) {
		int[] arr = { 50, 70, 60, 90, 40, 0, 10, 20 };
		System.out.println(Arrays.toString(arr));
		
		QuickSorting ob = new QuickSorting();
		ob.QuickSort(arr, 0, arr.length-1);

		System.out.println(Arrays.toString(arr));
	}

	private void QuickSort(int[] A, int low, int high) {
		if (low < high) {
			int pi = partitioning(A, low, high); // A[p] in sorted position
			QuickSort(A, low, pi - 1); // Sort elements in range: A[low], A[p-1]
			QuickSort(A, pi + 1, high); // Sort elements in range: A[p+1], A[high]
		}

	}

	private static int partitioning(int[] a, int low, int high) {
		int pivot = a[high];
		int i = low-1;
		
		for (int j = low; j < high ; j++) {
			if(a[j] < pivot) {
				i++;
				//swap(a[i], a[j]);
				int temp;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		//swap(a[i+1], a[high]);
		int temp;
		temp = a[i+1];
		a[i+1] = a[high];
		a[high] = temp;
		return i+1;
		
	}
}

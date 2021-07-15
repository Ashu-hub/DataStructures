package Array.Search;
//WAP to search an element from an array.

//PreRequisite:- Elements must be unique and sorted.

/*Initial Array:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Search 5
output = 4*/
/*
Analysis:-
Best case = 0(1) // element is found at mid
Worst Case = 0(logn)

Point to remember= Successive Multiplication is power. Successive division is log.
*/
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int key = 5;
		int result = binSearchByIteration(arr, 0, arr.length - 1, key);
		System.out.println("Binary Search using Iteration-"+result);

		result = binSearchByRecurssion(arr, 0, arr.length - 1, key);
		System.out.println("Binary Search using Recussion-"+ result);
	}

	private static int binSearchByRecurssion(int[] arr, int low, int high, int key) {
		if (low < high) {

			int mid = (low + high) / 2;

			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				return binSearchByRecurssion(arr, low, mid - 1, key);
			}
			return binSearchByRecurssion(arr, mid + 1, high, key);
		}
		return -1;
	}

	private static int binSearchByIteration(int[] arr, int l, int h, int key) {

		while (l < h) {
			int mid = (l + h) / 2;

			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				h = h - 1;
			} else {
				l = mid + 1;
			}
		}

		return -1;

	}

}

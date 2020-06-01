package Array;

import java.util.Arrays;

/*
WAP to add an Element in the array
Initial Array:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Array with 50 added:
[1, 2, 3, 4, 50, 5, 6, 7, 8, 9]
*/

public class InsertElementInFixedSizedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int pos = 5;
		int element = 50;
		int n = 10;
		System.out.println("Before Insrtion-" + Arrays.toString(arr));
		insertElement(arr, pos, element, n);

	}

	private static void insertElement(int[] arr, int pos, int element, int n) {
		for (int i = n - 1; i > pos - 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[pos - 1] = element;

		System.out.println("After Insrtion-" + Arrays.toString(arr));
	}

}

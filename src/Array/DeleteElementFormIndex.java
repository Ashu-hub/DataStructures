package Array;

import java.util.Arrays;

/*
WAP to add an Element in the array
Initial Array:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Array after 5 deleted:
[1, 2, 3, 4, 6, 7, 8, 9, 10]
*/
public class DeleteElementFormIndex {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int index = 5;
		int n = 10;
		System.out.println(Arrays.toString(arr));
		delete(arr, index, n);
	}

	private static void delete(int[] arr, int index, int n) {
		for (int i = index - 1; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[n - 1] = 0;
		System.out.println(Arrays.toString(arr));
	}
}

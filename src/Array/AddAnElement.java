package Array;

import java.util.Arrays;

/*
WAP to add an Element in the array
Initial Array:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Array with 50 added:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 50]
*/
public class AddAnElement {
	// For this we need to copy existing array into new array of greater size.
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int n = 10; // size
		int elementToBeAdded = 50;

		System.out.println("Before Insertion Array is- " + Arrays.toString(arr));
		arr = addElement(n, arr, elementToBeAdded);
		System.out.println("After Insertion Array is- " + Arrays.toString(arr));

	}

	private static int[] addElement(int n, int[] arr, int elementToBeAdded) {
		int[] copyArr = new int[n + 1];
		
		for (int i = 0; i < arr.length; i++) {
			copyArr[i] = arr[i];
		}
		copyArr[n] = elementToBeAdded;

		return copyArr;
	}
}

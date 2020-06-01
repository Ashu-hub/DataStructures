package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
WAP to add an Element in the array
Initial Array:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Array with 50 added:
[1, 2, 3, 4, 50, 5, 6, 7, 8, 9, 10]
*/
public class InsertAnElementAtIndex {
	// 1st Approach- create an array with size more than 1 --> copy 0 to
	// pos-1-->insert new element--> copy rest elements.
	// 2nd Approach - using ArrayList

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int n = 9;
		int pos = 5;
		int elementToInsert = 50;
		System.out.println("Initial Array-" + Arrays.toString(arr));
		insertElement(n, arr, pos - 1, elementToInsert);
	}

	private static void insertElement(int n, Integer[] arr, int index, int elementToInsert) {

		List<Integer> newArrlist = new ArrayList<>(Arrays.asList(arr));
		newArrlist.add(index, elementToInsert);
		System.out.println("Array with 50 added:" + Arrays.toString(newArrlist.toArray()));
	}

}

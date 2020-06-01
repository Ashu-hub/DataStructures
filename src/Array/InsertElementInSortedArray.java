package Array;

import java.util.Arrays;

//WAP to insert an element in a sorted Array
/*Input Array = [1, 2, 4, 19]
 * element =3
Output Array = [1, 2, 3, 4]*/
public class InsertElementInSortedArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 19 };
		int element = 3;
		System.out.println("Input Array "+Arrays.toString(arr));
		insert(arr, element);
	}

	private static void insert(int[] arr, int element) {
		int i = arr.length - 2;
		while (arr[i] > element) { //4>3
			arr[i+1] = arr[i];
			i--;
		}
		arr[i+1] = element;
		System.out.println("Output Array "+Arrays.toString(arr));
	}

}

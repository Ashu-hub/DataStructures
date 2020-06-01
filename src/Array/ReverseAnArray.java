package Array;

import java.util.Arrays;

//WAP to reverse an Array.
/*Initial Array:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
OutPut Array:-
[10,9,8,7,6,5,4,3,2,1]*/
public class ReverseAnArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Original Array is-" + Arrays.toString(arr));
		reverseUsingAuxiliaryArray(arr);
		
		reverse(arr);
	}

	private static void reverse(int[] arr) {
		for (int i = 0, j= arr.length-1; i ==j ; i++, j--) {
			swap(arr[i],arr[j]);
		}
		System.out.println("Reversed Array without using Auxiliary array is-"+Arrays.toString(arr));
		
	}

	private static void swap(int i, int j) {
		int temp;
		temp = i;
		i = j;
		j = temp;
	}

	private static void reverseUsingAuxiliaryArray(int[] arr) {

		int[] brr = new int[arr.length];
		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			brr[j] = arr[i];
		}
		for (int i = 0; i < brr.length; i++) {
			arr[i] = brr[i];
		}
		System.out.println("Reversed Array using Auxiliary array is" + Arrays.toString(arr));
	}

}

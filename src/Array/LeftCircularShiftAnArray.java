package Array;
//WAP to Left Circular shift of an Array
/*Input Array = [1, 2, 4, 19]
Output Array = [2, 4, 19, 1]*/

import java.util.Arrays;

public class LeftCircularShiftAnArray {

	public static void main(String[] args) {
		int [] arr = {1, 2, 4, 19};
		leftshift(arr);
	}

	private static void leftshift(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
		System.out.println(Arrays.toString(arr));
	}

}

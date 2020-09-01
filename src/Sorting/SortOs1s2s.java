package Sorting;

import java.util.Arrays;

public class SortOs1s2s {
//Dutch National Flag algo
	//0(n), 0(1)
	public static void main(String[] args) {
		int[] arr = { 2, 0, 1, 2, 0, 1 };
		sortit(arr);
	}

	public static void sortit(int[] nums) {
		int low = 0;
		int mid = 0;
		int high = nums.length - 1;
		int temp;
		while (mid <= high) {
			switch (nums[mid]) {

			case 0: {
				temp = nums[mid];
				nums[mid] = nums[low];
				nums[low] = temp;
				mid++;
				low++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
				break;
			}
		}
	}
		System.out.println(Arrays.toString(nums));

	}

	public static void swap(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
	}
}
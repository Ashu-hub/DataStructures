package Array;

import java.util.Arrays;

//WAP to merge two sorted array and results into one sorted array
public class Merge2SortedArray {

	public static void main(String[] args) {
		int arr1[] = {1,4,7,10,13,15};
		int arr2[] = {2,5,8,11,14,16};
		merge(arr1, arr2);
	}

	private static void merge(int[] arr1, int[] arr2) {
		int i = 0, j=0, k =0;
		int c[] = new int[arr2.length+arr1.length];
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
			c[k++] = arr1[i++];
			}
			
			else if(arr2[j] < arr1[i]) {
				c[k++] = arr2[j++];
			}
		}
		for(; i< arr1.length; i++) {
			c[k] = arr1[i]; 
		}
		for(; j<arr2.length;j++) {
			c[k] = arr2[j];
		}
	System.out.println("Merged Array"+ Arrays.toString(c));
	
	}

}

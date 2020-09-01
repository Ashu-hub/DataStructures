package Array;

import java.util.Arrays;

public class MissingAndRepeatingNumber {
//output 2, 3
	public static void main(String[] args) {
		int [] arr ={4, 3, 6, 2, 1, 1};// {3,1,3};
		findit(arr);
	}

	private static void findit(int[] arr) {
		int low = Arrays.stream(arr).min().getAsInt();
		int high =Arrays.stream(arr).max().getAsInt();
		
		int [] subarray = new int[high+1];
		
		for (int i = 0; i < arr.length; i++) {
			subarray[arr[i]]++;
		}
		
		for (int i = low; i <= high; i++) {
			if(subarray[i] > 1) {
				System.out.println("Repeated element is "+ i);
			}
			if(subarray[i] == 0) {
				System.out.println("Missing element is "+i);
			}
		}
		
		
	}

}

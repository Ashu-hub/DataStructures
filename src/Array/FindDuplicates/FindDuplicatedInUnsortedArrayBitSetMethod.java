package Array.FindDuplicates;

import java.util.Arrays;

//WAP to find and Count Duplicated in an Unsorted Array using BitSet/HashTable method
//Analysis - 0(n)
public class FindDuplicatedInUnsortedArrayBitSetMethod {

	public static void main(String[] args) {
		int[] arr = { 8, 3, 6, 4, 6, 5, 6, 8, 2, 7 };
		findDuplicated(arr);
	}

	private static void findDuplicated(int[] arr) {
		int h = findMaxElement(arr);
		int [] b = new int [h+1];
		for (int i = 0; i < arr.length; i++) {
			b[arr[i]]++; 
		}
		for (int i = 0; i < b.length; i++) {
			if(b[i] > 1) {
				System.out.println("Number "+i+" Repeated "+ b[i]+ " times");
			}
		}
	}

	//Show Off java 8
/*	private static int findMaxElement(int[] arr) {
		return Arrays.stream(arr).max().getAsInt();
	}*/
	
	//ActualLogic
	private static int findMaxElement(int[] arr) {
		int max = arr[0];
		for (int a : arr) {
			if (a > max) {
				max = a;
			}
		}
		return max;
	}

}

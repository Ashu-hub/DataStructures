package Array;

import java.util.Arrays;

//WAP to find missing elements in an unsorted Array
//P.S- Know lowest number, highest number and number of elements
//BitSetMethod:-
public class MissingElementinUnsortedArray {

	public static void main(String[] args) {
		int a[] = { 3, 7, 4, 9, 12, 6, 1, 11, 2, 10 };
		findMissingElements(a);
	}

	private static void findMissingElements(int[] a) {
		int l = findMinMax(a)[0];
		int h = findMinMax(a)[1];

		int[] arr = new int[h + 1]; // this is called hash-table or bit-set
		
		for (int i = 0; i < a.length; i++) {
			arr[a[i]] ++;
		}

		for (int i = l; i < h; i++) {
			if (arr[i] == 0) {
				System.out.println(i);
			}
		}
	}

	private static int[] findMinMax(int[] a) {
		int min = a[0], max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		int[] x = new int[2];
		x[0] = min;
		x[1] = max;
		return x;
	}

}

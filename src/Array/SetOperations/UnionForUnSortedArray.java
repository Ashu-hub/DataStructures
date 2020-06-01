package Array.SetOperations;

import java.util.Arrays;

//WAP to find union (all elements of two arrays, no duplicate) of two unsorted Array. 
// TimeComplexity - 0(n2)
public class UnionForUnSortedArray {

	public static void main(String[] args) {
		int a[] = { 3, 5, 10, 4, 6 };
		int b[] = { 12, 4, 7, 2, 15 };
		findUnion(a, b);
	}

	private static void findUnion(int[] a, int[] b) {
		int c[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		//first copy all elements from a to c
		for (; i < a.length; i++) {
			c[k++] = a[i];
		}
		//copy only those elements not present in c
		for (; j < b.length; j++) {
			if (!presentInC(c, b[j])) {
				c[k++] = b[j];
			}
		}
		
		System.out.println(Arrays.toString(c));
	}

	private static boolean presentInC(int[] c, int j) {
		for (int k = 0; k < c.length; k++) {
			if (c[k] == j) {
				return true;
			}
		}
		return false;
	}

}

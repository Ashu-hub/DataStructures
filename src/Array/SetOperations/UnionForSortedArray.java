package Array.SetOperations;

import java.util.Arrays;

//WAP to find union(all elements of two arrays, no duplicate) of two sorted Array and output will be a sorted Array/
//Time Complexity - Theta(n)
public class UnionForSortedArray {

	public static void main(String[] args) {

		int a[] = {3,4,5,6,10};
		int b[] = {2,4,5,7,12};
		findUnion(a,b);
	}

	private static void findUnion(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		
		//we will use merge technique for getting the sorted array
		int i=0, j=0, k=0;
		while(i < a.length && j < b.length) {
			if(a[i]<b[j]) {
				c[k++] = a[i++];
			}
			else if(b[j] < a[i]) {
				c[k++] = b[j++];
			}
			else if(a[i] == b[j]) {
				c[k++] = a[i++];
				j++;
			}
		}
		for (; i < a.length; i++) {
			c[k] = a[i];
		}
		for (; j < b.length; j++) {
			c[k] = b[j];
		}
	System.out.println(Arrays.toString(c));
	}

}

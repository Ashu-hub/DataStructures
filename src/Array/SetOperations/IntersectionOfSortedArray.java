package Array.SetOperations;

import java.util.Arrays;

//WAP to find the intersection(Common elements bet two arrays) of Sorted Array
//prerequisite- Array should be same size
public class IntersectionOfSortedArray {

	public static void main(String[] args) {

		int a[] = { 3, 4, 5, 6, 12 };
		int b[] = { 2, 4, 5, 7, 12 };
		findIntersection(a, b);
	}

	private static void findIntersection(int[] a, int[] b) {

		int[] c = new int[a.length + b.length];
		int k = 0, i = 0, j = 0;
	
		while (i < a.length-1 && j < b.length-1) {
			if(a[i] < b[j]) {
				i++;
			}
			else if(b[j]<a[j]){
				j++;
			}
			else if(a[i] == b[j]) {
				c[k++] = a[i++];
				j++;
			}
			System.out.println(i+" "+j);
		}
		if (a[a.length-1] == b[b.length-1]) {
			c[k] = a[a.length-1];
		}
		System.out.println(Arrays.toString(c));
	}

}

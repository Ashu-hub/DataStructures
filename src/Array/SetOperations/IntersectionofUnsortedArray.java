package Array.SetOperations;

import java.util.Arrays;

//WAP to find intersection(Common elements bet two arrays) of two arrays.
//Time Complexity is 0(n2)
public class IntersectionofUnsortedArray {

	public static void main(String[] args) {
		int []a = {3,5,10,4,6};
		int []b = {12,4,7,2,5};
		fintIntersection(a,b);
	}

	private static void fintIntersection(int[] a, int[] b) {
		int c[] = new int[a.length+b.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					c[k++] = a[i];
				}
			}
		}
		System.out.println(Arrays.toString(c));
		
	}

}

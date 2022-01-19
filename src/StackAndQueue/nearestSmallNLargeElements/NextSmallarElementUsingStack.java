package StackAndQueue.nearestSmallNLargeElements;

import java.util.ArrayDeque;
import java.util.Deque;

//Input - arr[] = { 3, 10, 5, 1, 15, 10, 7, 6 };
//Ouput - 			1, 5 , 1, -1, 10, 7, 6,	-1
public class NextSmallarElementUsingStack {

	public static void main(String[] args) {
		int arr[] = { 3, 10, 5, 1, 15, 10, 7, 6 };
		nextSmallerElement(arr);

	}

	private static void nextSmallerElement(int[] arr) {
		Deque<Integer> st = new ArrayDeque<Integer>();
		int result[] = new int[arr.length];
		int j=0;
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!st.isEmpty() && st.peek() >= arr[i]) {
				st.pop();
			}

			if (st.isEmpty()) {
				//System.out.print("-1 ");
				result[j++] = -1;
			} else {
				//System.out.print(st.peek() + " ");
				result[j++] = st.peek();
			}
			st.push(arr[i]);
		}
		for (int i = result.length-1; i >= 0; i--) {
			System.out.print(result[i]+" ");
		}

	}

}

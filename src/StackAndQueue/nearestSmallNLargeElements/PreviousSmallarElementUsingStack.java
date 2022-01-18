package StackAndQueue.nearestSmallNLargeElements;
//WAP to print Previous Smallest element

import java.util.ArrayDeque;
import java.util.Deque;

//Input: [4, 10, 5, 8, 20, 15, 3 ,12]
//OutPut: [-1, 4, 4, 5, 8, 8, -1, 3]

import java.util.Stack;

public class PreviousSmallarElementUsingStack {

	public static void main(String[] args) {
		int arr[] = { 4, 10, 5, 8, 20, 15, 3, 12 };
		findPrevSmallest(arr);
	}

	private static void findPrevSmallest(int[] arr) {
		//Stack<Integer> st = new Stack<>(); OR 
		Deque<Integer> st = new ArrayDeque<>();//use this as Stack class uses Vector which works on index, while stack in definition doesn't uses index while it uses element.

		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && st.peek() >= arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				System.out.print("-1" + " ");
			} else {
				System.out.print(st.peek() + " ");
			}
			st.push(arr[i]);
		}
	}

}

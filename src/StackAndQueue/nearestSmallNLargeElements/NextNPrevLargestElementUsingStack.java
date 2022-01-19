package StackAndQueue.nearestSmallNLargeElements;

import java.util.ArrayDeque;
import java.util.Deque;

//Input - int arr[] = { 3, 10, 5, 1, 15, 10, 7, 6 };
//Next Largest OutPut -10, 15, 15, 15, -1, -1, -1, -1
//Prev Largest OutPut- -1, -1, 10, 5, -1, 15, 10, 7
public class NextNPrevLargestElementUsingStack {

	public static void main(String[] args) {
		int arr[] = { 3, 10, 5, 1, 15, 10, 7, 6 };
		findNextLargest(arr);
		findPrevLargest(arr);
	}

	private static void findPrevLargest(int[] arr) {
		Deque<Integer> st = new ArrayDeque<>();
		for (int i = 0; i < arr.length; i++) {
			while(!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}
			if(st.isEmpty())
			{
				System.out.print("-1 ");
			}
			else {
				System.out.print(st.peek()+" ");
			}
		st.push(arr[i]);
		}
	}

	private static void findNextLargest(int[] arr) {
		Deque<Integer> st = new ArrayDeque<>();
		for (int i = arr.length-1; i >= 0; i--) {
			
			while(!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				System.out.print("-1 ");
			}
			else {
				System.out.print(st.peek()+" ");
			}
			st.push(arr[i]);
		}
		//need to reverse the result
	}

}

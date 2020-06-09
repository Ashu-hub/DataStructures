package LinkedList;

import java.util.Arrays;

public class ReverseUsingArray {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	private static ReverseUsingArray insert(ReverseUsingArray list, int d) {
		Node newNode = new Node(d);
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node current = list.head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		return list;
	}

	private static void display(ReverseUsingArray list) {
		Node current = list.head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println(current);
	}

	private static void reverse(ReverseUsingArray list) {
		int[] arr = new int[3];
		int i = 0;
		Node current = list.head;
		while (current != null) {
			arr[i++] = current.data;
			current = current.next;
		}
		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j] + "  ");
		}
	}

	public static void main(String[] args) {
		ReverseUsingArray list = new ReverseUsingArray();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		display(list);

		reverse(list);
	}

}

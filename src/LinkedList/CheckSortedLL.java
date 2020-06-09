package LinkedList;

public class CheckSortedLL {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	private static CheckSortedLL insert(CheckSortedLL list, int d) {
		Node newNode = new Node(d);

		if (list.head == null) {
			list.head = newNode;
		} else {
			Node currNode = list.head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;

		}
		return list;
	}

	private static void display(CheckSortedLL list) {
		Node currNode = list.head;
		while (currNode.next != null) {
			System.out.print(currNode.data + "-->");
			currNode = currNode.next;
		}
		System.out.print(currNode.next);
	}

	private static boolean isSorted(CheckSortedLL list) {
		int min = 0;
		Node currNode = list.head;
	
		while (currNode.next != null) {
			if(currNode.data < min) {
				return false;
			}
			min = currNode.data;
			currNode = currNode.next;
		}
		return true;
	}

	public static void main(String[] args) {
		CheckSortedLL list = new CheckSortedLL();
		list = insert(list, 2);
		list = insert(list, 4);
		list = insert(list, 6);
		list = insert(list, 8);
		list = insert(list, 10);
		list = insert(list, 12);
		display(list);
		System.out.println();
		System.out.println("Is Sorted-> "+isSorted(list));
	}
}

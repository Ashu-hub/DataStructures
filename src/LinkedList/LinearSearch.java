package LinkedList;

public class LinearSearch {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		LinearSearch list = new LinearSearch();
		list = insert(list, 1);
		list = insert(list, 10);
		list = insert(list, 20);
		list = insert(list, 12);
		list = insert(list, 14);
		display(list);

		System.out.println(searchIterative(list, 14));
		System.out.println(searchRecurssive(list.head, 14));
	}

	private static boolean searchRecurssive(Node head, int key) {
		Node currNode = head;
		if (currNode.data == key) {
			return true;
		}

		return (searchRecurssive(currNode.next, key));
	}

	private static boolean searchIterative(LinearSearch list, int key) {
		Node currNode = list.head;

		while (currNode != null) {
			if (currNode.data == key) {
				return true;
			}
			currNode = currNode.next;
		}
		return false;
	}

	private static void display(LinearSearch list) {
		Node currNode = list.head;
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}

	}

	private static LinearSearch insert(LinearSearch list, int d) {
		Node newNode = new Node(d);

		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}

}

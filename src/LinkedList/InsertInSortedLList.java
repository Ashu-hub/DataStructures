package LinkedList;

public class InsertInSortedLList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	private static InsertInSortedLList insert(InsertInSortedLList list, int d) {
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

	private static void displaylist(InsertInSortedLList list) {
		Node currNode = list.head;
		while (currNode != null) {
			System.out.print(currNode.data + "-->");
			currNode = currNode.next;
		}
		System.out.println(currNode);
	}

	private static InsertInSortedLList insertInSortedLL(InsertInSortedLList list, int d) {
		Node newNode = new Node(d);
		
		if (list.head.data > d) {
			newNode.next = list.head;
			list.head = newNode;
		}
		else {
			Node previous = null;
			Node currNode = list.head;

			while (currNode != null && currNode.data < d) {
				previous = currNode;
				currNode = currNode.next;
			}
			previous.next = newNode;
			newNode.next = currNode;
		}
		return list;
	}

	public static void main(String[] args) {
		InsertInSortedLList list = new InsertInSortedLList();
		list = insert(list, 4);
		list = insert(list, 7);
		list = insert(list, 12);
		list = insert(list, 15);
		displaylist(list);

		// insert node(10)
		list = insertInSortedLL(list, 3);
		displaylist(list);
	}
}

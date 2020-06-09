package LinkedList.CircularLinkedList;

public class Insertion {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	private static void insert(int d) {
		Node newNode = new Node(d);

		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	private static void diplayCircularLL(Insertion list) {
		Node currenNode = Insertion.head;
		do {
			System.out.print(currenNode.data + "-->");
			currenNode = currenNode.next;
		} while (currenNode != Insertion.head);
		System.out.print(currenNode.data);

	}

	private static void insertAtPos(Insertion list, int d, int pos) {
		Node newNode = new Node(d);
		if (pos == 0) {
			if (list.head == null) {
				head = newNode;
				head.next = head;

			} else {
				newNode.next = list.head;
				Node currNode = list.head;

				while (currNode.next != head) {
					currNode = currNode.next;
				}
				currNode.next = newNode;
				list.head = newNode;
			}
		} else {
			Node currNode = list.head;
			for (int i = 0; i < pos - 1; i++) {
				currNode = currNode.next;
			}
			newNode.next = currNode.next;
			currNode.next = newNode;
			
		}
	}

	public static void main(String[] args) {

		Insertion list = new Insertion();
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		Insertion.head.next.next.next.next.next = Insertion.head;
		System.out.println("Circular Linked List- ");
		diplayCircularLL(list);
		int position = 3;
		int newnode = 14;
		System.out.println();
		System.out.println("After Insertion- ");
		insertAtPos(list, newnode, position);
		diplayCircularLL(list);
	}

}

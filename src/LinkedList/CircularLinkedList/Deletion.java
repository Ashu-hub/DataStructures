package LinkedList.CircularLinkedList;

public class Deletion {
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

	private static void diplayCircularLL(Deletion list) {
		Node currenNode = Deletion.head;
		do {
			System.out.print(currenNode.data + "-->");
			currenNode = currenNode.next;
		} while (currenNode != Deletion.head);
		System.out.print(currenNode.data);

	}

	private static void delete(Deletion list, int pos) {
		if (pos == 0) {
			throw new RuntimeException();

		} else if (pos == 1) {
			Node p = Deletion.head.next;
			Node currNode = Deletion.head.next;

			while (currNode.next != Deletion.head) {
				currNode = currNode.next;
			}
			currNode.next = p;
			Deletion.head = currNode;

		} else {
			Node currNode= Deletion.head;
			for(int i= 0; i< pos-2; i++) {
				currNode = currNode.next;
			}
			currNode.next = currNode.next.next ;
		}

	}

	public static void main(String[] args) {
		Deletion list = new Deletion();
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		Deletion.head.next.next.next.next.next = Deletion.head;
		System.out.println("Circular Linked List- ");
		diplayCircularLL(list);
		int pos = 3;
		delete(list, pos);
		System.out.println();
		diplayCircularLL(list);
	}

}

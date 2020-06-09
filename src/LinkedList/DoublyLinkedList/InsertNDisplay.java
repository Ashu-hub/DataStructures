package LinkedList.DoublyLinkedList;

public class InsertNDisplay {
	static Node head;

	static class Node {
		Node prev;
		int data;
		Node next;

		Node(int d) {
			prev = null;
			data = d;
			next = null;
		}
	}

	private static void insert(int d) {
		Node newNode = new Node(d);

		if (InsertNDisplay.head == null) {
			InsertNDisplay.head = newNode;
		} else {
			Node currNode = InsertNDisplay.head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
			newNode.prev = currNode;
		}

	}

	private static void display() {
		Node currNode = InsertNDisplay.head;
		while (currNode != null) {
			System.out.print(currNode.data + "-->");
			currNode = currNode.next;
		}
		System.out.println(currNode);

	}

	private static void insertAtPos(int d, int pos) throws Exception {
		Node newNode = new Node(d);
		if (pos == 0) {
			throw new Exception();

		} else if (pos == 1) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		} else {
			Node currNode = head;
			for (int i = 0; i < pos-2; i++) {
				currNode = currNode.next;
			}
			newNode.prev = currNode;
			newNode.next = currNode.next ;
			currNode.next = newNode;
			currNode.next.prev = newNode;
		}
	}

	public static void main(String[] args) throws Exception {
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		insert(6);
		System.out.println("Original Doubly Linked List");
		display();
		System.out.println("After Modification:- ");

		int pos = 3;
		insertAtPos(13, pos);
		display();

	}

}

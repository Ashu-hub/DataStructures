package LinkedList.DoublyLinkedList;

public class Reverse {
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

		if (head == null) {
			head = newNode;
		} else {
			Node currNode = head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
			newNode.prev = currNode;
		}

	}

	private static void display() {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + "-->");
			currNode = currNode.next;
		}
		System.out.println(currNode);

	}

	private static void reverseDLL() {
		Node currNode = head;
		
		while (currNode != null) {
			Node temp = currNode.next;
			currNode.next = currNode.prev;
			currNode.prev = temp;

			currNode = currNode.prev;

			if (currNode != null && currNode.next == null) {
				head = currNode;
			}
		}

	}

	public static void main(String[] args) {
		insert(11);
		insert(22);
		insert(33);
		insert(44);
		insert(55);
		insert(66);
		System.out.println("Original Doubly Linked List:-");
		display();
		System.out.println("After Reversing:-");
		reverseDLL();
		display();
	}

}

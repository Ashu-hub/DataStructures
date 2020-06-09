package LinkedList.SimpleWay;

public class LinkedList {
	private Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private static void display(Node head) {
		if (head == null) {
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print(current);

	}

	public static void main(String[] args) {
		// Creation of Nodes
		Node head = new Node(10);
		Node second = new Node(0);
		Node third = new Node(1);
		Node fourth = new Node(11);

		// linkage
		head.next = second;
		second.next = third;
		third.next = fourth;
		display(head);
	}

}

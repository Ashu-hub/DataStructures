package LinkedList;

public class DeleteFomLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	private static DeleteFomLinkedList insert(DeleteFomLinkedList list, int d) {
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

	private static void display(DeleteFomLinkedList list) {
		Node currNode = list.head;
		while (currNode != null) {
			System.out.print(currNode.data + "-->");
			currNode = currNode.next;
		}
		System.out.println(currNode);

	}

	private static DeleteFomLinkedList delete(DeleteFomLinkedList list, int d) {
		Node currNode = list.head, previous = null;
		//first element
		if (list.head.data == d) {
			list.head = list.head.next;
		} 
		//delete element at position 
		else {
			while (currNode.data != d) {
				previous = currNode;
				currNode = currNode.next;
			}
			previous.next = currNode.next;
			currNode.next = null;
		}
		return list;
	}

	public static void main(String[] args) {
		DeleteFomLinkedList list = new DeleteFomLinkedList();
		list = insert(list, 1);
		list = insert(list, 3);
		list = insert(list, 14);
		list = insert(list, 5);
		list = insert(list, 2);
		display(list);
		// delete 14
		list = delete(list, 1);
		display(list);
	}
}

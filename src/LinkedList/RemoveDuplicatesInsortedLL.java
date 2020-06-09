package LinkedList;

public class RemoveDuplicatesInsortedLL {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	private static RemoveDuplicatesInsortedLL insert(RemoveDuplicatesInsortedLL list, int d) {
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

	private static void display(RemoveDuplicatesInsortedLL list) {
		Node currNode = list.head;
		while (currNode != null) {
			System.out.print(currNode.data + "-->");
			currNode = currNode.next;
		}
		System.out.print(currNode);
	}

	private static RemoveDuplicatesInsortedLL removeDuplicates(RemoveDuplicatesInsortedLL list) {
		Node currNode = list.head;
		Node previous = null;

		while (currNode.next != null) {
			previous = currNode;
			currNode = currNode.next;
			
			if (currNode.data == previous.data) {
				previous.next = currNode.next;
				currNode = currNode.next;
			}
		}

		return list;
	}

	public static void main(String[] args) {
		RemoveDuplicatesInsortedLL list = new RemoveDuplicatesInsortedLL();
		list = insert(list, 1);
		list = insert(list, 4);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 5);
		list = insert(list, 10);
		display(list);

		//
		System.out.println();
		list = removeDuplicates(list);
		display(list);
	}

}

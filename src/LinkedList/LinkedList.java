package LinkedList;
//WAP to insert and Display Linked List
public class LinkedList {
	Node head;// head of list

	// This inner class is made static
	// so that main() can access it
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		displayList(list);
	}

	private static void displayList(LinkedList list) {
		Node currNode = list.head;
		
		while(currNode != null) {
			System.out.print(currNode.data+"-->");
			currNode = currNode.next;
		}
		
	}

	private static LinkedList insert(LinkedList list, int data) {
		// create an new node with given data
		Node newNode = new Node(data);

		// if List is empty insert it at first
		if (list.head == null) {
			list.head = newNode;
		}
		// else traverse through linked list and add it to last
		else {
			Node current = list.head;

			while (current.next != null) {
				current = current.next;
			}

			current.next = newNode;
		}
		return list;
	}
	
}

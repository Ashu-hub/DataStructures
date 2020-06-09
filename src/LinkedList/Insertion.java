package LinkedList;

/**
 * @author ashu
 *
 */
public class Insertion {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private static Insertion insert(Insertion list, int d) {
		Node newNode = new Node(d);

		if (list.head == null) {
			list.head = newNode;
		} else {
			Node current = list.head;
			while (current.next != null) {
				current = current.next;
			}

			current.next = newNode;
		}
		return list;
	}

	private static void display(Insertion list) {
		Node current = list.head;

		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println(current);

	}

	private static Insertion insertBeg(Insertion list, int d) {
		Node newNode = new Node(d);
		newNode.next = list.head;
		list.head = newNode;
		return list;
	}

	private static Insertion insertAfterANode(Insertion list, int d, int key) {
		Node newNode = new Node(d);
		Node current = list.head;

		while (current.data != key) {
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;

		return list;
	}


	private static Insertion insertUsingIndex(Insertion list,int data, int pos) {
		Node newNode = new Node(data);
		Node previous = list.head;
		int count = 1;
		while(count < pos -1 ) {
			previous = previous.next;
			count++;
		}
		Node current = previous.next;
		previous.next = newNode;
		newNode.next = current;
		
		return list;
	}

	
	public static void main(String[] args) {
		Insertion list = new Insertion();
		// insert at last example
		list = insert(list, 0);
		list = insert(list, 10);
		list = insert(list, 11);
		display(list);

		// insertAtBegning
		list = insertBeg(list, 12);
		display(list);

		// insertAfteraNode say 10
		list = insertAfterANode(list, 40, 10);
		display(list);
		
		//insert using index
		//insert at position 3(i.e. after 10)
		list = insertUsingIndex(list, 81, 4);
		display(list);
	}

}

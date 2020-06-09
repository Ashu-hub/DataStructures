package LinkedList;

public class ReverseUsingSlidingPointer {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	private static ReverseUsingSlidingPointer insert(ReverseUsingSlidingPointer list, int d) {
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

	private static void display(ReverseUsingSlidingPointer list) {
		Node current = list.head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println(current);
	}
	
	//All three Node are Sliding
	private static ReverseUsingSlidingPointer reverseList(ReverseUsingSlidingPointer list) {
		Node current = list.head;
		Node prev = null;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		list.head = prev;
		return list;
	}

	public static void main(String[] args) {

		ReverseUsingSlidingPointer list = new ReverseUsingSlidingPointer();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		display(list);

		list = reverseList(list);
		display(list);
	}

}

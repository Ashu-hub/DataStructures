package LinkedList;

/**
 * @author ashutosh
 *
 */
public class MaximumElementInLL {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		MaximumElementInLL list = new MaximumElementInLL();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 13);
		list = insert(list, 4);
		list = insert(list, 5);
		display(list);
		findMaxElement(list);
	}

	private static void findMaxElement(MaximumElementInLL list) {
		Node currNode = list.head;
		int max = currNode.data;
		while (currNode != null) {
			if (currNode.data > max) {
				max = currNode.data;
			}
			currNode = currNode.next;
		}
		System.out.println();
		System.out.println("Maximun Element is " + max);
	}

	public static void display(MaximumElementInLL list) {
		Node currNode = list.head;

		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}

	}

	private static MaximumElementInLL insert(MaximumElementInLL list, int d) {
		Node newNode = new Node(d);

		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;

			while (last.next != null) {
				last = last.next;
			}

			last.next = newNode;
		}
		return list;
	}
}
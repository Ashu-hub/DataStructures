package LinkedList;

public class CountingAndSumOfAllNodes {
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
		// TODO Auto-generated method stub
		CountingAndSumOfAllNodes list = new CountingAndSumOfAllNodes();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		display(list);
		countNodes(list);
		addAllelements(list);
	}

	private static void addAllelements(CountingAndSumOfAllNodes list) {
		int sum = 0;
		Node currNode = list.head;
		while (currNode != null) {
			sum += currNode.data;
			currNode = currNode.next;
		}
		System.out.println("Sum of All Elements are " + sum);
	}

	private static void countNodes(CountingAndSumOfAllNodes list) {
		int countNodes = 0;
		Node currNode = list.head;
		while (currNode != null) {
			countNodes++;
			currNode = currNode.next;
		}
		System.out.println("Number of nodes is " + countNodes);

	}

	private static void display(CountingAndSumOfAllNodes list) {
		Node currNode = list.head;

		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}

	}

	private static CountingAndSumOfAllNodes insert(CountingAndSumOfAllNodes list, int d) {
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

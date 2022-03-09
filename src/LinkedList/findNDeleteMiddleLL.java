package LinkedList;

// 2 pointer technique
// move 1 pointer by 1 and second by 2. 
public class findNDeleteMiddleLL {
	Node head;

	static class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private findNDeleteMiddleLL insert(findNDeleteMiddleLL list, int data) {
		Node newNode = new Node(data);
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

	private void display(findNDeleteMiddleLL list) {
		Node currNode = list.head;
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		findNDeleteMiddleLL list = new findNDeleteMiddleLL();

		list = list.insert(list, 1);
		list = list.insert(list, 2);
		list = list.insert(list, 3);
		list = list.insert(list, 4);
		list = list.insert(list, 5);
		list = list.insert(list, 6);

		list.display(list);
		System.out.println();

		int middle = findMiddle(list);
		System.out.println(middle);

		deleteMiddle(list);
		list.display(list);
	}

	private static findNDeleteMiddleLL deleteMiddle(findNDeleteMiddleLL list) {
		int middle = findMiddle(list);
		Node currNode = list.head;
		Node previous = null;
		while (currNode.data != middle) {
			previous = currNode;
			currNode = currNode.next;
		}
		previous.next= currNode.next;
		currNode.next = null;
		return list;
	}

	private static int findMiddle(findNDeleteMiddleLL list) {
		Node slow = list.head, fast = list.head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.data;
	}

}

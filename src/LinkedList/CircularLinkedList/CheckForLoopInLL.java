package LinkedList.CircularLinkedList;

//WAP to check that given Linked list is having loop or not.
//Solution:- It will follow the same concept of linear track and circular track.
//If A(having speed x) and B(having speed 2x) are running =on a Linear track they will never meet each other.
//but if the track is circular they will definitely meet at point x after say t time. 
class Node {
	int data;
	Node next;

	public Node(int d) {
		data = d;
		next = null;
	}
}

public class CheckForLoopInLL {
	static Node head;

	private static void insert(int d) {
		Node newNode = new Node(d);

		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	private static void display(CheckForLoopInLL list) {
		Node current = list.head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println(current);

	}

	private static boolean checkforLoop(CheckForLoopInLL list) {
		Node p, q = null;
		p = q = CheckForLoopInLL.head;

		do {
			p = p.next;
			q = q.next;
			q = q.next != null ? q.next : null;

			if (p == q) {
				return true;
			}

		} while (p != null && q != null && q.next != null);

		return false;
	}

	public static void main(String[] args) {
		CheckForLoopInLL list = new CheckForLoopInLL();
		insert(1);
		insert(2);
		insert(3);
		insert(1);
		insert(2);
		display(list);

		System.out.println("The Above list is having loop- " + checkforLoop(list));
		//creating loop
		CheckForLoopInLL.head.next.next.next.next = CheckForLoopInLL.head;
		
		//display(list); this will go on infinite.
		System.out.println("The Above list is having loop- " + checkforLoop(list));
	}

}

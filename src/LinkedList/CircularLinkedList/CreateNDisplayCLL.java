package LinkedList.CircularLinkedList;

public class CreateNDisplayCLL {
	static Node head;
	
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}


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

	private static void display(CreateNDisplayCLL list) {
		Node current = CreateNDisplayCLL.head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println(current);

	}

	private static void diplayCircularLL(CreateNDisplayCLL list) {
		Node currenNode = CreateNDisplayCLL.head;
				do {
					System.out.print(currenNode.data+"-->");
					currenNode = currenNode.next;
				}while(currenNode != CreateNDisplayCLL.head);
		System.out.print(currenNode.data);
		
	}
	
	public static void main(String[] args) {
		CreateNDisplayCLL list = new CreateNDisplayCLL();
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		System.out.println("Linear Linked List- ");
		 display(list);
		
		CreateNDisplayCLL.head.next.next.next.next.next = CreateNDisplayCLL.head;
		
		//display(list); This will go on infinte loop
		System.out.println("Circular Linked List- ");
		diplayCircularLL(list);
		
	}

	

}
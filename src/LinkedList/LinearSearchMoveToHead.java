package LinkedList;
//Not compelted.
public class LinearSearchMoveToHead {
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
		LinearSearchMoveToHead list = new LinearSearchMoveToHead();
		list.push(1);
		list.push(10);
		list.push(11);
		list.push(12);
		display(list);
		if(search(list, 12)) {
			System.out.println("Found.");
		}
		else {
			System.out.println("Not Found!!");
		}
	}

	private static boolean search(LinearSearchMoveToHead list, int key) {
		Node p = list.head;
		Node q = null;
		while(p != null) {
			if(p.data == key) {
				//q.next = p.next;
				p = list.head;
				
				//display(list);
				return true;
			}
			q = p;
			p = p.next;
			
		}
		return false;
	}

	private static void display(LinearSearchMoveToHead list) {
		Node currNode = list.head;
		while(currNode != null) {
			System.out.print(currNode.data+" ");
			currNode= currNode.next;
		}
		
	}

	public void push(int d) {
		Node newNode = new Node(d);
		newNode.next = head;
		head = newNode;
	}
}

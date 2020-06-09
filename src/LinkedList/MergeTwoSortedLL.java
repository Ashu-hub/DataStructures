package LinkedList;

import java.awt.List;

public class MergeTwoSortedLL {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	private static MergeTwoSortedLL insert(MergeTwoSortedLL list1, int d) {
		Node newNode = new Node(d);
		if (list1.head == null) {
			list1.head = newNode;
		} else {
			Node currNode = list1.head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
		}
		return list1;
	}

	private static void display(MergeTwoSortedLL list) {
		Node currNode = list.head;
		while (currNode != null) {
			System.out.print(currNode.data + "-->");
			currNode = currNode.next;
		}
		System.out.println(currNode);
	}

	private static MergeTwoSortedLL merge(MergeTwoSortedLL list1, MergeTwoSortedLL list2) {
		Node currOne = list1.head, currTwo = list2.head;
		MergeTwoSortedLL result  = new MergeTwoSortedLL();
		Node resultNode = new Node(0);
		result.head = resultNode;
		
		while (currOne != null && currTwo != null) {
			if (currOne.data < currTwo.data) {
				resultNode.next = currOne;
				currOne = currOne.next;

			}
			else if (currTwo.data < currOne.data) {
				resultNode.next = currTwo;
				currTwo = currTwo.next;
			}
		resultNode = resultNode.next;
		}
		if(currOne!=null) {
			resultNode.next = currOne;
		}
		if(currTwo != null) {
			resultNode.next = currTwo;
		}
		 return result;
	}

	public static void main(String[] args) {
		MergeTwoSortedLL list1 = new MergeTwoSortedLL();
		list1 = insert(list1, 1);
		list1 = insert(list1, 3);
		list1 = insert(list1, 5);
		list1 = insert(list1, 7);
		list1 = insert(list1, 9);
		display(list1);

		MergeTwoSortedLL list2 = new MergeTwoSortedLL();
		list2 = insert(list2, 2);
		list2 = insert(list2, 4);
		list2 = insert(list2, 6);
		list2 = insert(list2, 8);
		list2 = insert(list2, 10);
		display(list2);

		MergeTwoSortedLL mergedList = merge(list1, list2);
		display(mergedList);
	}
}

package StackAndQueue;
//WAP to perform enqueue(Insert) and dequeue(delete) on queue using Array

class Queues {
	private int maxSize;
	private int[] queue;
	private int front, rear;

	public Queues(int maxSize) {
		this.maxSize = maxSize;
		this.queue = new int[maxSize];
		front = rear = -1;
	}

	public void enqueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		} else {
			if (front == -1) {
				front = 0;
			}
			queue[++rear] = element;
		}
	}
	
	public int dequeue() {
		int element;
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		else {
			element = queue[front];
			if (front >= rear) {
		        front = -1;
		        rear = -1;
		      }
			else {
				front++;
			}
			return element;
		}
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public boolean isFull() {
		return front == 0 && rear == (maxSize-1);
	}

}

public class QueueImplementationUsingArray {

	public static void main(String[] args) {

		Queues q = new Queues(3);
		
		q.enqueue(10);
		q.enqueue(15);
		q.enqueue(6);
		
		while(!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
	}

}

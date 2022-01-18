package StackAndQueue;
//WAP to implement Cicular Queue Using Array

//Remember that for calculating frint and rear in circular queue, we use 
//front = (front+1) % size
//rear = (rear+1) % size

//We need to track of size of array, as capaity may not be 0

class CircularQueue {
	private int capacity;
	private int[] cq;
	private int front, rear;
	private int size;

	public CircularQueue(int maxSize) {
		this.capacity = maxSize;
		rear = front = -1;
		cq = new int[capacity];
		size = 0;
	}

	public void cEnqueue(int element) {
		if (isFull()) {
			System.out.println("Circular Queue is Full");
			return;
		} else {
			if (front == -1) {
				front = 0;
			}
			rear = (rear + 1) % capacity;
			cq[rear] = element;
			size++;
			System.out.println("Inserted element-" + element);
		}
	}

	public void cDequeue() {
		int element;
		if (isEmpty()) {
			System.out.println("Circular queue is empty!");
			return ;
		} else {
			element = cq[front];
			if (front > rear) {
				front = rear = -1;
			} else {
				front = (front + 1) % capacity;
			}
			size--;
			System.out.println("Deleted element is- " + element);
		}
	}

	private boolean isFull() {
		return front == 0 && rear == (capacity - 1);
	}

	private boolean isEmpty() {
		return size == 0;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Circular Queue is Empty");
			return;
		} else {
			for (int i = front; i <= rear; i++) {
				System.out.println(cq[i]);
			}
		}
	}
}

public class CircularQueueUsingArray {

	public static void main(String[] args) {

		CircularQueue cq = new CircularQueue(3);
		cq.cEnqueue(10);
		cq.cEnqueue(20);
		cq.cEnqueue(30);

		cq.display();

		cq.cDequeue();
		cq.cDequeue();

		cq.display();

		cq.cDequeue();
		cq.display();
	}

}

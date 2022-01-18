package StackAndQueue;
//WAP to implement Stack Usign Array. Stack is LIFO
class Stacks{
	private int maxSize;
	private int[] stack;
	private int top;
	
	public Stacks(int maxSize) {
		this.maxSize = maxSize;
		top = -1;
		stack = new int[maxSize];
	}
	
	public void push(int element) {
		stack[++top] = element;
	}
	
	public int pop() {
		return stack[top--];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == (maxSize -1);
	}

}

public class StackImplementationUsingArray {

	public static void main(String[] args) {
		Stacks st = new Stacks(4);
		
		st.push(10);
		st.push(15);
		st.push(8);
		
		while(!st.isEmpty()) {
			int value = st.pop();
			System.out.println(value);
		}
	}

}

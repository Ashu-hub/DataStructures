package Trees.binaryTree.IterativeWay;

import java.util.Stack;

//WAP to create following Tree
/*
		1
	   /  \
	  2     3
	 / \   / \
	4   5 6   7
*/
//output - 1 2 4 5 3 6 7
public class PreOrder {
	static TreeNode root;

	static class TreeNode {

		TreeNode lChild;
		int data;
		TreeNode rChild;

		TreeNode(int d) {
			lChild = null;
			data = d;
			rChild = null;
		}
	}

	static public void create() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seven = new TreeNode(7);

		root = first;
		first.lChild = second;
		first.rChild = third;

		second.lChild = fourth;
		second.rChild = fifth;

		third.lChild = sixth;
		third.rChild = seven;

	}

	public static void main(String[] args) {
		create();
		preOrderTraversal(root);
	}

	private static void preOrderTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode current = root;
		
		while ( current != null ||  !stack.isEmpty()) {

			if (current != null) {
				stack.push(current);
				System.out.print(current.data + " ");
				current = current.lChild;
			} else {
				current = stack.pop();
				current = current.rChild;

			}
		}

	}

}

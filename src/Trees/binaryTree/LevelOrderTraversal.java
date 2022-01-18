package Trees.binaryTree;

//WAP to create following Tree
/*
		1
	   / \
	  2   3
	 / \
	4   5 
*/
import java.util.LinkedList;
import java.util.Queue;
//Output = 1 2 4 3 5 6

public class LevelOrderTraversal {
	static TreeNode root;

	static class TreeNode {
		TreeNode lChild;
		int data;
		TreeNode rChild;

		TreeNode(int d) {
			data = d;
		}
	}

	public static void main(String[] args) {
		createTree();
		printLevelOrder();
	}

	private static void printLevelOrder() {
		if (root == null) {
			return;
		} else {
			Queue<TreeNode> q = new LinkedList<>();
			q.offer(root);
			while (!q.isEmpty()) {
				TreeNode temp = q.poll();
				System.out.print(temp.data + " ");
				if (temp.lChild != null) {
					q.offer(temp.lChild);
				}
				if (temp.rChild != null) {
					q.offer(temp.rChild);
				}

			}
		}

	}

	private static void createTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);

		root = first;
		root.lChild = second;
		root.rChild = fourth;

		second.lChild = third;
		second.rChild = fifth;

		third.lChild = sixth;

	}

}

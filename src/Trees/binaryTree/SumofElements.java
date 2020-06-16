package Trees.binaryTree;

import Trees.binaryTree.CreateBinaryTree.TreeNode;

//WAP to find Sum of all the elements of a tree.
public class SumofElements {

	public static void main(String[] args) {
		CreateBinaryTree tree = new CreateBinaryTree();
		tree.create();
		System.out.println("Sum of all nodes are-" + findSum(tree.root));

	}

	private static int findSum(TreeNode root) {
		int x, y;
		if (root != null) {
			x = findSum(root.lChild);
			y = findSum(root.rChild);
			return x + y + root.data;
		}
		return 0;
	}

}

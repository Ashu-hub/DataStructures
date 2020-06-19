package Trees.binarySearchTree;

//WAP to create BST from key - 9, 15, 5, 20, 16, 8 12,3,6 
//Analysis - 0(nlog)
public class CreateBSTRecurssive {

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
		root = insert(root, 9);
		int arr[] = { 15, 5, 20, 16, 8, 12, 3, 6 };
		for (int i = 0; i < arr.length; i++) {
			insert(root, arr[i]);
		}
	}

	private static TreeNode insert(TreeNode root, int d) {
		if (root == null) {
			TreeNode newNode = new TreeNode(d);
			root = newNode;
			return root;
		}
		if (d > root.data) {
			root.rChild = insert(root.rChild, d);
		} else {
			root.lChild = insert(root.lChild, d);
		}
		return root;
	}

}

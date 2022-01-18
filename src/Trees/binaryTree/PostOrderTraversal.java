package Trees.binaryTree;

//Output should be - 4 5 2 3 1
//WAP to create following Tree
/*
		1
	   / \
	  2   3
	 / \
	4   5 

Post Order = left right root
*/
import Trees.binaryTree.CreateBinaryTree.TreeNode;

public class PostOrderTraversal {

	public static void main(String[] args) {
		CreateBinaryTree tree = new CreateBinaryTree();
		tree.create();
		postOrderTraversal(tree.root);

	}

	private static void postOrderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}
		postOrderTraversal(root.lChild);
		postOrderTraversal(root.rChild);
		System.out.print(root.data + " ");

	}

}

package Trees.binaryTree;

import Trees.binaryTree.CreateBinaryTree.TreeNode;

//WAP for InOrder Traversal
//Output should be - 4 2 5 1 3
public class InOrderTraversal {

	public static void main(String[] args) {
		CreateBinaryTree tree = new CreateBinaryTree();
		tree.create();
		inOrderTraverse(tree.root);

	}

	private static void inOrderTraverse(TreeNode root) {
		if (root != null) {
			inOrderTraverse(root.lChild);
			System.out.print(root.data + " ");
			inOrderTraverse(root.rChild);
		}

	}
//Time Complexity is 0(n)
//logn <= height <= n ;n is no of nodes 	
}

package Trees.binaryTree;
//WAP to Print PreOrder.
//Output should be - 1 2 4 5 3
import Trees.binaryTree.CreateBinaryTree.TreeNode;

/*
		1
	   / \
	  2   3
	 / \
	4   5 

 PreOrder =  root left right
*/
public class PreOrderTraversal {

	public static void main(String[] args) {
		CreateBinaryTree obj = new CreateBinaryTree();
		obj.create();
		preOrderTraverse(obj.root);
	}

	private static void preOrderTraverse(TreeNode root) {

		if (root == null) {
			return ;
		}

			System.out.print(root.data + " ");
			preOrderTraverse(root.lChild);
			preOrderTraverse(root.rChild);

	}

}

package Trees.binaryTree;
//Output should be - 4 5 2 3 1
import Trees.binaryTree.CreateBinaryTree.TreeNode;

public class PostOrderTraversal {

	public static void main(String[] args) {
		CreateBinaryTree tree = new CreateBinaryTree();
		tree.create();
		postOrderTraversal(tree.root);
		

	}

	private static void postOrderTraversal(TreeNode root) {
		if(root != null) {
			postOrderTraversal(root.lChild);
			postOrderTraversal(root.rChild);
			System.out.print(root.data+ " ");
		}
		
	}

}

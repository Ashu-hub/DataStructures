package Trees.binaryTree;

import Trees.binaryTree.CreateBinaryTree.TreeNode;

public class CountNumberOfNodes {

	public static void main(String[] args) {
		CreateBinaryTree tree = new CreateBinaryTree();
		tree.create();
		System.out.println("Number of nodes are:- "+count(tree.root));
	}

	private static int count(TreeNode root) {
		int x,y;
		if(root != null) {
			x = count(root.lChild);
			y = count(root.rChild);
			return x+y+1;
		}
		return 0;
		
	}

}

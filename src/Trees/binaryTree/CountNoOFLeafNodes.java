package Trees.binaryTree;

import Trees.binaryTree.CreateBinaryTree.TreeNode;

public class CountNoOFLeafNodes {

	public static void main(String[] args) {
		CreateBinaryTree tree = new CreateBinaryTree();
		tree.create();
		System.out.println("Leafs nodes are - " + leafNodes(tree.root));
	}

	private static int leafNodes(TreeNode root) {
		int x, y;
		if (root != null) {
			x = leafNodes(root.lChild);
			y = leafNodes(root.rChild);
			if (root.lChild == null && root.rChild == null) { // it will count nodes with degree 0; for nodes with
																// degree 2 condition would be if (root.lChild != null
																// && root.rChild != null)
																// for deg 1 -> if((root.lChild != null && root.rChild
																// ==null ) || (root.lChild == null && root.rChild
																// !=null ))
				return x + y + 1;
			} else {
				return x + y;
			}
		}
		return 0;
	}

}

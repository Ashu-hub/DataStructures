package Trees.binaryTree;

import Trees.binaryTree.CreateBinaryTree.TreeNode;

//WAP to count nodes with degree exactly 1
public class CountNodeWithdeg1 {

	public static void main(String[] args) {
		CreateBinaryTree tree = new CreateBinaryTree();
		tree.create();
		System.out.println("No of nodes with Exactly degree one are- " + count(tree.root));

	}

	private static int count(TreeNode root) {
		int x, y;
		if (root != null) {
			x = count(root.lChild);
			y = count(root.rChild);
			// the real condition is if((root.lChild != null && root.rChild
			// ==null ) || (root.lChild == null && root.rChild
			// !=null ))
			// which can rewrite as LR` + RL` = L^R(L Xor R)

			if ((root.lChild != null) ^ (root.rChild != null)) {
				return x + y + 1;
			} else {
				return x + y;
			}
		}
		return 0;
	}

}

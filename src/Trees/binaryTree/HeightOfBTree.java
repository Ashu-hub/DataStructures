package Trees.binaryTree;

import Trees.binaryTree.CreateBinaryTree.TreeNode;

//WAP to find height of a Binary Tree
public class HeightOfBTree {

	public static void main(String[] args) {
		CreateBinaryTree tree = new CreateBinaryTree();
		tree.create();
		System.out.println("Height of a tree is-"+height(tree.root));

	}

	private static int height(TreeNode root) {
		int x, y;
		if(root != null) {
			x = height(root.lChild);
			y = height(root.rChild);
			if(x>y) {
				return x+1;
			}
			else {
				return y+1;
			}
		}
		return 0;
	}

}

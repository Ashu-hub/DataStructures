package Trees.binarySearchTree;

import Trees.binarySearchTree.CreateBST.TreeNode;

//WAP to insert 45 into BST
/*
		   30
		  /   \
		15      50
	   /   \   /  \
	  10    20 40   60
				 \
				  45
*/
//Analysis - 0(logn)
public class InsertInBST {

	public static void main(String[] args) {

		CreateBST.createBST();
		int elementoInsert = 45;
		// mere dimag ki upaj
		 insertBST(CreateBST.root, elementoInsert, null);
		System.out.println("New Inserted node is MY Way " + CreateBST.root.rChild.lChild.rChild.data);
		// Iterative way
		insertBSTIterative(CreateBST.root, elementoInsert);
		System.out.println("New Inserted node is " + CreateBST.root.rChild.lChild.rChild.data);

	}

	private static void insertBSTIterative(TreeNode root, int elementoInsert) {
		TreeNode newNode = new TreeNode(elementoInsert);
		TreeNode prev = null;

		while (root != null) {
			prev = root;
			if (elementoInsert == root.data) {
				return;
			} else if (elementoInsert > root.data) {
				root = root.rChild;
			} else if (elementoInsert < root.data) {
				root = root.lChild;
			}
		}
		if (elementoInsert > prev.data) {
			prev.rChild = newNode;
		} else {
			prev.rChild = newNode;
		}

	}

	private static TreeNode insertBST(TreeNode root, int elementoInsert, TreeNode prev) {
		if (root == null) {
			root = new TreeNode(elementoInsert);
			prev.rChild = root;
			return root;
		}
		if (elementoInsert > root.data) {
			insertBST(root.rChild, elementoInsert, root);
		}
		if (elementoInsert < root.data) {
			insertBST(root.lChild, elementoInsert, root);
		}
		return null;
	}

}

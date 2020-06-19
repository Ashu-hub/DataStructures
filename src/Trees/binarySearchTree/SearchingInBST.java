package Trees.binarySearchTree;

import Trees.binarySearchTree.CreateBST.TreeNode;

//WAP to search an element in BST
//Analysis:-
/*The number of comparison in successful search depends on height of a tree, h and we know
	log(n) <= h <= n
	So,
	Time taken for successful/unsuccessful search is O(h)
	and O(h) = O(logn)*/
public class SearchingInBST {

	public static void main(String[] args) {

		CreateBST.createBST();
		int elementToSearch = 20;
		// Recursive way
		TreeNode rRes = Rsearch(elementToSearch, CreateBST.root);
		System.out.println("Element is found at Node by Recursive way- " + (rRes == null ? 0 : rRes.data));
		// Iterative way
		TreeNode res = search(elementToSearch, CreateBST.root);
		System.out.println("Element is found at Node by Iterative way- " + (res == null ? 0 : res.data));

	}

	private static TreeNode search(int elementToSearch, TreeNode root) {

		while (root != null) {
			if (elementToSearch == root.data) {
				return root;
			} else if (elementToSearch > root.data) {
				root = root.rChild;
			} else {
				root = root.lChild;
			}
		}
		return null;
	}

	private static TreeNode Rsearch(int elementToSearch, TreeNode root) {
		if (root == null) {
			return null;
		}
		if (elementToSearch == root.data) {
			return root;
		} else if (elementToSearch < root.data) {
			return Rsearch(elementToSearch, root.lChild);
		} else {
			return Rsearch(elementToSearch, root.rChild);
		}
	}

}

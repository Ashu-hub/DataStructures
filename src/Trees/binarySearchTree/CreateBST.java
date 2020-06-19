package Trees.binarySearchTree;

//WAP to create following
/*
		   30
		  /   \
		15      50
	   /   \   /  \
	  10    20 40   60

*/ public class CreateBST {
	static TreeNode root;

	static class TreeNode {
		TreeNode lChild;
		int data;
		TreeNode rChild;

		TreeNode(int d) {
			data = d;
		}
	}

	public static void main(String[] args) {
		createBST();

	}

	static void createBST() {
		TreeNode first = new TreeNode(30);
		TreeNode second = new TreeNode(15);
		TreeNode third = new TreeNode(50);
		TreeNode fourth = new TreeNode(10);
		TreeNode fifth = new TreeNode(20);
		TreeNode sixth = new TreeNode(40);
		TreeNode seventh = new TreeNode(60);

		root = first;
		first.lChild = second;
		first.rChild = third;

		second.lChild = fourth;
		second.rChild = fifth;

		third.lChild = sixth;
		third.rChild = seventh;

	}

}

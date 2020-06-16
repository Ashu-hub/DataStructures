package Trees.binaryTree;

//WAP to create following Tree
/*
		1
	   / \
	  2   3
	 / \
	4   5 
*/
public class CreateBinaryTree {

	TreeNode root;

	 class TreeNode {
		 TreeNode lChild;
		 int data;
		 TreeNode rChild;

		public TreeNode(int d) {
			lChild = null;
			data = d;
			rChild = null;
		}
	}

	public void create() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		
		root = first;
		root.lChild = second;
		root.rChild = third;
		
		second.lChild = fourth;
		second.rChild = fifth;
		
		fourth.lChild = sixth;
	}

	public static void main(String[] args) {
		CreateBinaryTree obj =new CreateBinaryTree();
		 obj.create();
		 

	}

}

package Trees.binaryTree.IterativeWay;
//ouptut- 4 2 5 1 6 3 7
import java.util.Stack;

import Trees.binaryTree.IterativeWay.PreOrder.TreeNode;

public class InOrder {

	public static void main(String[] args) {
		PreOrder.create();
		postOrderTraversal(PreOrder.root);
	}

	private static void postOrderTraversal(TreeNode root) {
		Stack<TreeNode> st = new Stack<>();
		TreeNode current = root;

		while (current != null || !st.isEmpty()) {

			if (current != null) {
				st.push(current);
				current = current.lChild;
			} else {
				current = st.pop();
				System.out.print(current.data +" ");
				current= current.rChild;
			}
		}

	}

}

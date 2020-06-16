package Trees.binaryTree.IterativeWay;

//Output - 4 5 2 6 7 3 1 
import java.util.Stack;
//Concept explanation:- https://www.youtube.com/watch?v=qT65HltK2uE 
import Trees.binaryTree.IterativeWay.PreOrder.TreeNode;

public class PostOrder {

	public static void main(String[] args) {
		PreOrder.create();
		postOrderTraversal(PreOrder.root);

	}

	private static void postOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		Stack<TreeNode> s1 = new Stack<>();
		Stack<TreeNode> s2 = new Stack<>();
		s1.push(root);
		
		while(!s1.isEmpty()) {
			root = s1.pop();
			s2.push(root);
			if(root.lChild != null) {
				s1.push(root.lChild);
			}
			if(root.rChild != null) {
				s1.push(root.rChild);
			}
		}
		while(!s2.isEmpty()) {
			root= s2.pop();
			System.out.print(root.data+" ");
		}
	}

}

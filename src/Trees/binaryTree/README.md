# Binary Tree Representation:-
```java
	class TreeNode{
		TreeNode left ; 
		int data;
		TreeNode right;
		
		TreeNode (int d){
		left = null;
		data = d;
		right = null;
		}
	}
```
# Binary Tree Traversal
Traversal means visiting all nodes one by one.
If data Structure is linear we can traverse it forward direction(first to last) and backward(last to first).
If the Data Structure is non- linear like binary trees, these are the possible traversal methods:-


* PreOrder - visit(root) , preorder(left child), reorder(right child)
* InOrder - left , root , right
* PostOrder - left, right, root
* LevelOrder - level by level

# Can We generate a Tree from Traversal?
If We know only preorder or inorder or Post order- the no of tree can be generated is catalon number- **2nCn/n+1.
We cant generate a tree from traversal only if following traversal are known:-
	Either - PreOrder and InOrder
	OR 		- PostOrderand InOrder
Reason:- InOrder gives the capability to decide what element is there on left side and what element is on right side.	
# Trees
Tree is a collection of Nodes where one node is a root node and rest of the nodes are divide into disjoint sub-sets or sub trees.
n vertices -> n-1 edges
 
# Terminology
* Root - the very first node is root.
* Parent -  An node is a parent to its very next desendents/ child.
* Siblings - Children if same Parent.
* Descendents - All sets of node which can be reach from a particular node.
* Ancestors - For any node all the nodes along the path to root node.
* Degree -  Number of  direct children.
* Internal/External Nodes or Non Leaf / Leaf Node - Node with degree 0 is called Leaf node.And Any nodewith degree > 0 is non- leaf nodes.
* Levels - Starts with 1 from root node. Horizental distnace nodes.
* Height - Root is at 0 height. Count edges from root, that is height.
* Forest - Collection of Tree.

# Binary Tree:- 
A tree with degree 2. Means  any node can have maximun 2 childre. Can have Less than 2 children.
i.e deg:{0,1,2}

Left Skewed Binary Trees:-     a
							 /
						    b
						   /
						  c
						  
* Number of Binaru Trees:-
Catalan number = T(n)= 2nCn/n+1

* Maximun height = 2pow(n-1)
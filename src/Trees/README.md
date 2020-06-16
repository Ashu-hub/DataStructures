# Trees
Tree is a collection of Nodes where one node is a root node and rest of the nodes are divide into disjoint sub-sets or sub trees.
n vertices -> n-1 edges
 
# Terminology
* Root - the very first node is root.
* Parent -  An node is a parent to its very next descendants/ child.
* Siblings - Children if same Parent.
* Descendants - All sets of node which can be reach from a particular node.
* Ancestors - For any node all the nodes along the path to root node.
* Degree -  Number of  direct children.
* Internal/External Nodes or Non Leaf / Leaf Node - Node with degree 0 is called Leaf node.And Any node with degree > 0 is non- leaf nodes.
* Levels - Starts with 1 from root node. Horizontal distance between nodes.
* Height - Root is at 0 height. Count edges from root, that is height.
* Forest - Collection of Tree.

# Binary Tree:- 
A tree with degree 2. Means  any node can have maximun 2 children. It Can have Less than 2 children as well.
i.e deg:{0,1,2}

* Left Skewed Binary Trees:-     a
							 /
						    b
						   /
						  c
						  
* Number of Binary Trees-
Catalan number = T(n)= 2nCn/n+1

* Maximum height = 2pow(n-1)

### Height Vs Node:-

* If height is given, calculate min and max number of nodes:
If, height = h
SO, **min no. of nodes = h+1**
	**max no.of nodes = 2pow(h+1)- 1**
eg;
 h = 3
 By formula:-
 min number of nodes = 4
 max no of nodes = 15

* If nodes are given, calculate min and max height
	** min height = log(n+1) -1 **
	** max height = n-1 **

* Degree Relationship for **Binary Tree** -
 deg(0) = deg(2) + 1
 
 # Strict Binary Tree:-
 Definition- A Binary Tree which can have either 2 children or 0 children.
 
### Height Vs Node:-

* If height is given, calculate min and max number of nodes:
If, height = h
SO, **min no. of nodes = 2h+1**
	**max no.of nodes = 2pow(h+1)- 1**

* If nodes are given, calculate min and max height
	** min height = log(n+1) -1 **
	** max height = (n-1)/2 **

### Relationship between leaf node and internal nodes:- 
** External Nodes/Leaf Nodes  = Internal Nodes + 1 **

# n-Array Tree:-
Tress can have capacity of at-most n children. It may have less than 3 children also.
* Strict n-Array tree = A tree that can have either 0 children or exactly n children.

### Height Vs Node:-

* If height is given, calculate min and max number of nodes:
If, height = h, m = degree of tree, n = no of nodes 
SO, **min no. of nodes = mh+1**
	**max no.of nodes = (mpow(h+1) - 1)/ m-1 **

* If nodes are given, calculate min and max height
	** min height = log[n(m-1)+1] -1 **
	** max height = (n-1)/m **
	
** External Nodes/Leaf Nodes  = (m-1)Internal Nodes + 1 **

# Representation of Binary Tree:-
* Array Representation
* Linked Representation

* Array Representation-
If any element is at i its
	Left child is at = 2*i
	Right child is at = 2*i+1
	And parent is at =  |i/2|
	
* Linked Representation-
	It is liken doubly liked list. List is linear representation, so we can't call list as Tree is non-linear representation.
```java
	class Node{
	Node leftChild;
	int data;
	Node rChild;
```
Number of Null pointers:- n+1

### Full And Complete binary tree
* Full Binary Tree:- A binary Tree of height h, having maximum numbers of nodes, is called Full Binary Tree. 
{formula for maximum max no of nodes, n = 2pow(h+1) -1}

* Complete Binary tree:-
A binary tree of height h, will be a full binary tree of h-1 height and at last element are filled from left to right without skipping any element.
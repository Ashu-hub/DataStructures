# Linked List:-
* Linked List is Collection of nodes where each node contains data and address/pointer to next node.
* A Linked List is varible in size unlike Array, which has fixed size.

## Advantages of Linked List Over Array
* Dynamic size.
* Ease of insertion/deletion.
* Less Memory wastage due to dynamic memory allocation.

## Advantages of Array Over Linked List
* Array Allows Random Access to the elements, as it works on Index.
* Linked List also uses more storage space in memory as each node contains data and reference.

```java
Linked lists should be used for large lists of data where the total number of items in the list is changing/not known in advance. 
Arrays, on the other hand, are better suited to small lists, where the maximum number of items that could be on the list is known. 
```

## Comparision of Linear Linked List, Doubly Linked List, Circular Linked list, Circular Doubly Linked List

|Parameter 	      | Linear Linked List   | Doubly Linked List   | Circular Linked list  | Circular Doubly Linked List |
| --------------- |:--------------------:|:--------------------:|:---------------------:| ---------------------------:|
|Space            | n 					 | 2n                  | n                      | 2n                         |
|Traversing		|UniDirectional		 |BiDirectional		  |UniDirectional		|BiDirectional				 |
|Insert(at pos 0) |Order of 1			 |Order of 1          |Order of n           | Order of 1                 |
|Insert/Deletion(at pos x) |Order of n			 |Order of n          |Order of n           | Order of n                 |
|Deletion(at pos 0) |Order of 1			 |Order of 1          |Order of n           | Order of 1                 |

```java
Java has built in Linked List class in java.util package called - Linked List
It is basically a Doubly linked list. 
```
## Comparision between Array And Linked List.
* Both Are two Physical Data Structure. Based on these two DS We implment other logical DS like(**Stack, Queues, Tree, Graph, HashTable**)
* Array- Fixed In Lenght; Linked List- Variable in Lenght
* Since Array has fixed lenght, the chances of getting perfectly utilize is less, either it will under utilized or not sufficent to store all elements.
* Space- Array has less Space utilization,equal to number of elements while Linked list occupy **Extra** pointer space.
* Accessibility - Array can be access randomly; while Linked list has sequential access.
* Faster Access - Array - direct 
* Insert/Deletiom At 0(Left hand side):-  Array 0(n) (Shifting Required); Linked List 0(1)(No Shifting required)
* Insert/Deletion At n(Right hand side):- Array 0(1) ; Linked List 0(n)
* **Movement** of data is involved with Array,so if integer say 2 byte we need to move but for complec onject 1000 byte may need to move. So Array is costly here.
* Searching:-
	**Array** - 	Linear Search takes 0(n) ; Binary Search takes 0(log n)
	**Linked List** Linear Search takes 0(n) ; Binary Search takes 0(nlog n)
	So Binary Search is costly in Linked List.
* Insertion Sort and Merge sort are more friendly to Linked List, while most other sorting are friendly to Array.



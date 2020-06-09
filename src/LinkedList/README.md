# Linked List:-
* Linked List is Collection of nodes where each node contains data and address/pointer to next node.
* A Linked List is varible in size unlike Array, which has fixed size.

## Advantages of Linked List Over Array
..* Dynamic size.
..* Ease of insertion/deletion.
..* Less Memory wastage due to dynamic memory allocation.

## Advantages of Array Over Linked List
..* Array Allows Random Access to the elements, as it works on Index.
..* Linked List also uses more storage space in memory as each node contains data and reference.

```java
Linked lists should be used for large lists of data where the total number of items in the list is changing/not known in advance. 
Arrays, on the other hand, are better suited to small lists, where the maximum number of items that could be on the list is known ```

## Comparision of Linear Linked List, Doubly Linked List, Circular Linked list, Circular Doubly Linked List

|Parameter 	      | Linear Linked List   | Doubly Linked List   | Circular Linked list  | Circular Doubly Linked List |
| --------------- |:--------------------:|:--------------------:|:---------------------:| ---------------------------:|
|Space            | n 					 | 2n                  | n                      | 2n                         |
|Traversing		|UniDirectional		 |BiDirectional		  |UniDirectional		|BiDirectional				 |
|Insert(at pos 0) |Order of 1			 |Order of 1          |Order of n           | Order of 1                 |
|Insert/Deletion(at pos x) |Order of n			 |Order of n          |Order of n           | Order of n                 |
|Deletion(at pos 0) |Order of 1			 |Order of 1          |Order of n           | Order of 1                 |

```java
Java has built in Linked List class called - Linked List
It is basically a Doubly linked list. ```
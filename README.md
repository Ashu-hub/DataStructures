# Data Structure:-
	Arrangement of data in a particular fashion.

# Types of Data Structure:-
	a) Physical DS.
	b) Logical DS.
	
# Physical DS:-
	These DS defines how the memories organized/ allocated for storing the data.
	e.g. 
	i) Array# Collection of contagious memory location, have fixed size. Created inside stack/heap.
		when to use Array- When number of elements is known before hand.
	ii) Linked List:- Collection of nodes where each node contains data and is connected to another node.
		The length of LL can be variable. 
		It is always created in the heap. Since it is dynamic in nature.
		
# Logical DS:-
	Linear(Stack, Queues), Non Linear (Trees, Graphs) , may be Both(HashTables)
.	Defines discipline needs to follow for operation on data.
. 	Logical DS are implemented using Physical DS either Array or Linked List or both.

. Stack- LIFO
. Queues - FIFO
. Tree - hierarchy

# Abstract Data Type:-
*	.	Data Type can be define as:
		i) 	Representation on Data.(how you are storing the data). eg:- int x; Integers is represented as 2 bytes, 1st bit as Signed bit and rest 15 bits are for storing the data.
		ii) Operation on Data.-- Arthematic Ops , Increment/ Decrement operator.
	
*	Abstract means hiding internal details.

 example:- List, it can have:-
	Data:- Space for storing the data
			Capacity 
			Size
	Operation:- add(x), remove, search(k).

So List is ADT, as it can be easily created using Array or Linked List, without bothering internal implementation.

## Operations:-
* add(element)/append(element)
* add(index, element)/ insert(index, element)
* remove(index)
* set(index, element)/ replace(index, element)
* get(index)
* search(key)/contains(key) #result is index
* sort()
* reverse() etc.

# Array
 [Operatios And Programs](https://github.com/Ashu-hub/DataStructures/tree/master/src/Array)

# Linked List
 [Singly Linked List](https://github.com/Ashu-hub/DataStructures/tree/master/src/LinkedList)
 
 [Doubly Linked List](https://github.com/Ashu-hub/DataStructures/tree/master/src/LinkedList/DoublyLinkedList)
 
 [Circular Linked List](https://github.com/Ashu-hub/DataStructures/tree/master/src/LinkedList/CircularLinkedList)
 
 [Trees](https://github.com/Ashu-hub/DataStructures/tree/master/src/Trees)
 

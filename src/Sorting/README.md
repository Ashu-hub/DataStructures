# Searching
## Criteria for Analysis to comapre the sorting techniques:-
* Number for Comparisons.
* Number of Swaps.
* Adaptive - If elements are already n sorted order, so the sorting techniques should take minimum time.
* Extra memory
* Stable - IF a sorting algorithm is preserving the order of **duplicate** elements then that algo is stable.

## List of Sorting Algo disscused here:-
### Comparisons based Sorts

#### n square Sorting algorithm 0(n2)
* Bubble sort
* Insertion sort
* Selection sort

#### nlog(n) Sorting algorithm 0(nlogn)
* Heap sort
* Merge sort
* Quick Sort
* Tree sort

#### n pow(3/2) 0(n3/2), so this is faster than n2 but slower than nlogn.
* Shell sort

#### Index Based Sort
#### 0(n) Sorting algorithm, but comsumes lot of space
* Count sort
* Bucket sort / Bin sort
* Radix Sort

## Comparisons between Bubble Sort and Insertion Sort
|Parameter		| Bubble Sort| Insertion Sort| Remark			|
|--------:		| --------   |:-------------:| ----  			|
|Min Comparison	| n			 | n 			 | Already Ascending|
|Max Comparison	| 0(n2)		 | 0(n2) 		 | In Descending	|
|Min Swaps		| 0(1)		 | 0(1) 		 | Ascending		|
|Max Swaps		| 0(n2)		 | 0(n2) 		 | Descending		|
|Adaptive		| Yes		 | Yes	 		 | 					|
|Stable			| Yes		 | Yes 			 | 					|
|Linked List	| No		 | Yes	 		 | 					|
|K pass			| Yes		 | No 			 | 					|


# Arrays

## Defination:
Single Valued Variables are Called **Scalar Variables** . Scalar Variables are only have magnitude. eg:- int a = 10;
*Array* is a collection of similar data elements grouped under one name.
Arrays are **Vector** Variables, which has magnitude and dimension.
Memory allocation in arrays are *Contiguous*.

## Declaring and Initialization:
```java
// 1D  Array
var-name = new type [size];
int A[5];
int A[5] = {1,2,3,4,5} //Declaration and Initialization.
int A[] = {1,2,3,4,5,6}
int[] intArray = new int[20];
int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };  // Declaring array literal

int[][] intArray = new int[10][20]; //a 2D array or matrix , memory will be allocation as 1D array with n x m size. 
int[][][] intArray = new int[10][20][10]; //a 3D array
```

## Accessing Array:
using a subscript(index).
```java
for(int i =0 ;i< 10; i++){
	System.out.println(a[i]);
}
```

## Can we Increase Array Size/length?
No you can't. The size/lenght of an array is fixed.
Why? - As it is possible that the next contiguous memory is not free, when we try to increase a size of an array. So it will voilet the defination of an Array.

## Array Representation by compiler:
	1D: Complier uses the formula to calculate address of any index:- BaseAddress + (index x size of the dataType)
	For 2D Representation two methods are there:
	*1) Row-Major Mapping * 
	*2) Column Major mapping*

*1) Row Major mapping:-
Elements are stored row by row. like 1st row first, 2nd row 2nd n so on.
Formaula to access elements:-
	``` Address of  a[i][j] in a[m][n] = baseAddr + [ixn + j]xw ; // w is size of dataType ```

*2) Column mapping:-
Elements are mapped column by column.
	``` Address of  a[i][j] in a[m][n] = baseAddr + [jxm + i]xw ; // w is size of dataType ```
	
* Complier can use anyof the two method. If you are designing your own complier you can you any as both are equivalent in time.
* C,C++, java uses Row-Major mappping method.

#### Formula for nD Array
	Type A[d1][d2][d3][d4]
	```
	Row-Major :-
	Address of A[i1][i2][i3][i4] = L0 + (i1xd2xd3xd4 + i2xd3xd4 +i3xd4 + i4)x w
	
	Column major :-
	Address of A[i1][i2][i3][i4] = L0 + (i4xd1xd2xd3 + i3xd2xd1 + i2xd1 + i1 )x w 
	
	```
	Time taken in Row-Major is 0(n2).
	By apply *Horner's Rule* we can reduce the time taken by 0(n).

## Array in java vs Array in C/C++
	1. In Java all arrays are dynamically allocated.
	2. Since arrays are objects in Java	, we can find their length using member length. This is different from C/C++ where we find length using sizeof.
	3. The variables in the array are ordered and each have an index beginning from 0
	4. Java array can be also be used as a static field, a local variable or a method parameter
	5. The size of an array must be specified by an int value and not long or short.
	6. The direct superclass of an array type is Object.
	7. Every array type implements the interfaces Cloneable and java.io.Serializable.


	
## Array ADT(AbstractData Type)
*Array togehter with Representation and Operations Called Abstract Data Type*
..* Representation - Space, Size, Length
..*Operations:- 
	1. display()
	2. add(x)/ append(x)
	3. insert(index,x)
	4. delete(index)
	5. search(x)
	6. get(index)
	7. set(x)
	8. max()/min()
	9. reverse()
	10. shift()/rotate().
	
package Array.Search;
//WAP to search an element from an array.
//PreRequisite:- Elements must be unique.

/*Initial Array:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Search 5
output = 4*/
//Transposition Linear Search -> In this the result is swap with the one position before, so that next time for same element one less comparison would happen.
//Move to Front/Head -> In this the result is swap with the 0th index, so that next time search will take 0(1) time.
//Time Complexity = 0(n)

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int key = 5;
		int result;

		result = linearSearch(arr, key);
		System.out.println(result);

		result = transpositionLinearSearch(arr, key);
		System.out.println("Through Transposition Search-" + result);

		result = moveToHead(arr, key);
	}

	private static int moveToHead(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				swap(arr[i], arr[0]);
				return i;
			}
		}
		return -1;
	}

	private static int transpositionLinearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				swap(arr[i], arr[i - 1]);
				return i;
			}

		}
		return -1;
	}

	private static void swap(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
	}

	private static int linearSearch(int[] arr, int elementTobeSearch) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == elementTobeSearch) {
				return i;
			}
		}
		return -1;

	}

}

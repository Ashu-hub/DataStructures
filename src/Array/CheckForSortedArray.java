package Array;

//WAP to find whether the given array is sorted or not?
public class CheckForSortedArray {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 12 };
		System.out.println("Array is Sorted- " + findsorted(arr));
	}

	private static boolean findsorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] < arr[i]) {
				return false;
			}
		}
		return true;
	}

}

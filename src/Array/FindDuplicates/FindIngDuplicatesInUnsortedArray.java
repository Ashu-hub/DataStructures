package Array.FindDuplicates;

//WAP to find and count Duplicates in an Unsorted Array.
//Order OF 0(n2)
public class FindIngDuplicatesInUnsortedArray {

	public static void main(String[] args) {

		int[] arr = { 8, 3, 6, 4, 6, 5, 6, 8, 2, 7 };
		findDuplicates(arr);
	}

	private static void findDuplicates(int[] arr) {
		int count;
		for (int i = 0; i < arr.length - 1; i++) {
			count = 1;
			if (arr[i] != -1) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						arr[j] = -1;
						count++;
					}
				}
				if (count > 1) {
					System.out.println("Number " + arr[i] + " is repeated " + count + " times");
				}
			}
		}
	}
}

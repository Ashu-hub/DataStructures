package Array;
//WAP to find out multiple missing element in a sorted Array
///Analysis - 0(n)
public class MultipleMissingElementInSortedArray {

	public static void main(String[] args) {

		int[] a = { 6, 7, 8, 9, 11, 12, 15, 16, 17, 18, 19 };
		findMissing(a);
	}

	private static void findMissing(int[] a) {
		int diff = a[0] - 0;

		for (int i = 0; i < a.length; i++) {
			int newDiff = a[i] - i;

			if (newDiff != diff) {
				while (diff < newDiff) {
					System.out.println("Missing Element is-" + (diff + i));
					diff++;
				}
			}

		}
	}

}

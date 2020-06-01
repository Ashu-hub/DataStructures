package Array.FindDuplicates;
//WAP to find and print duplicates in an sorted Array
public class FindDuplicateInSortedArray {

	public static void main(String[] args) {
		int a[] = {3,6,8,8,10,12,15,15,15,20};
		findDuplicates(a);
		
	}

	private static void findDuplicates(int[] a) {
		int lastDuplicate = 0;
		for (int i = 0; i < a.length-1; i++) {
			if(a[i] == a[i+1] && lastDuplicate != a[i]) {
				lastDuplicate = a[i];
				System.out.println(a[i]);
			}
		}
	}

}

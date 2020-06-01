package Array.FindDuplicates;

//WAP to count Duplicates in an Sorted Array
//Analysis- 0(n)
public class CountDuplicateInSortedArray {

	public static void main(String[] args) {
		int a[] = { 3, 6, 8, 8, 10, 12, 15, 15, 15, 20 };
		countDupliates(a);
	}

	private static void countDupliates(int[] a) {
		int j, lastDuplicate = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if(a[i] == a[i+1]) {
				j =i+1;
				while(a[j] == a[i]) {
					j++;
				}
				System.out.println("Number "+ a[i]+" is repeating "+(j-i)+" times.");
				i = j-1;
			}
		}
	}

}

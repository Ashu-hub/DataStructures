package Array.FindDuplicates;

//WAP using hashing/bit-set to count the number of duplicate elements.
//Analysis: 0(n)
public class CountDuplicateSortedArrayUsingHashing {

	public static void main(String[] args) {
		int []a = {3,6,8,8,10,12,15,15,15,20};
		findDupicates(a);
	}

	private static void findDupicates(int[] a) {
		int n = a[a.length-1];
		
		int []arr =new int[n+1];
		
		for (int i = 0; i < a.length; i++) {
			arr[a[i]] ++;
		}

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 1) {
				System.out.println("Number "+i+" is repeated "+arr[i]+" times");
			}
		}
	}

}

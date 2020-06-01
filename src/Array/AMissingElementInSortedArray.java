package Array;

//WAP to find A Missing Element In Sorted Array
/*Solution:-
1) By Sum method- when it is 1st n natural number, starting from 1.
2) ByIndex Difference method- for number not starting with 1.*/
public class AMissingElementInSortedArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,7,8,9,10};
		findMissingUsingSumMethod(a);
		
		int b[] = {6,7,8,9,10,12,13,14};
		findMissingUsingIndex(b);
	}
	

	private static void findMissingUsingIndex(int[] b) {
		int diff = b[0] - 0;
		for (int i = 0; i < b.length; i++) {
			int diff1 = b[i] - i;
			if(diff1 != diff )
			{
				System.out.println("Missing element thorugh index method is- "+ (i+diff));
				break;
			}
		}
	}


	private static void findMissingUsingSumMethod(int[] a) {
		int sumofElements = 0;
		int sumofnNaturalNumbers = 0;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			sumofElements += a[i];
		}
		sumofnNaturalNumbers = (a[n-1]*(a[n-1] + 1 ))/2;
		System.out.println("Missing numebr is "+ (sumofnNaturalNumbers-sumofElements));
	}

}

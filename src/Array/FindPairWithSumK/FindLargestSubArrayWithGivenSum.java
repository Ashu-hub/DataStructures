package Array.FindPairWithSumK;

public class FindLargestSubArrayWithGivenSum {
//WAP to find Largest Sub Array With Given Sum
	
	public static void main(String[] args) {
		/*
		 * int[] arr = { 5, 6, -5, 5, 3, 5, 3, -2, 0 }; int sum = 8;
		 */
		int[] arr = { 2, 3, 5, 1, 5, 2, 5, -2, 4 }; 
		int sum = 7;
		findPair(arr, sum);
	}

	private static void findPair(int[] arr, int s) {
		int len =0;
		int end_index = -1;
		
		for (int i = 0; i < arr.length; i++) {
		int sum = 0;	
		for (int j = i; j < arr.length; j++) {
			sum += arr[j];
			
			if (sum == s) {
				if (len < j - i + 1) { //j-i+1 is the size of sliding window
					len = j - i + 1;
					end_index = j;
					
				}
			}
		}
		}
		for (int i = (end_index-len+1); i <= end_index; i++) {
			System.out.print(arr[i] + " ");
		}
		//System.out.println("["+ (end_index-len+1) + ", " + end_index + "]");
	}

}

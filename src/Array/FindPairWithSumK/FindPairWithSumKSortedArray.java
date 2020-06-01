package Array.FindPairWithSumK;
//WAP to find Pair which has Sum k; a+b = k
//Analysis - 0(n)
public class FindPairWithSumKSortedArray {

	public static void main(String[] args) {
		int arr[] = {1,3,4,5,6,8,9,10,12,14};
		int sum =10;
		findPair(arr, sum );
	}

	private static void findPair(int[] arr, int sum) {
		int i =0, j = arr.length-1;
		while( i < j) {
			
			if(arr[i] + arr[j] == sum) {
				System.out.println("Numbers Are "+arr[i]+" & "+arr[j]);
			i++;j--;
			}
			else if(arr[i] + arr[j] < sum) {
				i++;
			}
			else {
				j--;
			}
			
		}
	}

}

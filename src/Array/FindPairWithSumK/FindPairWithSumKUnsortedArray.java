package Array.FindPairWithSumK;
//WAP To find Pair with Sum K. like a+b =k
//All Elements are unique, if there are duplicates elements then we have to remove them first and then performa this action.
public class FindPairWithSumKUnsortedArray {

	public static void main(String[] args) {
		int [] arr = {6,3,8,10,16,7,5,2,9,14};
		int sum = 10;
		findPair(arr,sum);
	}

	private static void findPair(int[] arr, int sum) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j] == sum) {
					System.out.println("Elements are "+arr[i]+" & "+ arr[j]);
					break;
				}
			}
		}
		
	}

}

package Array.FindPairWithSumK;
/*
 * Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
	Example 1:
	
	Input:
	N = 5
	Arr[] = {1,2,3,-2,5}
	Output:
	9
	Explanation:
	Max subarray sum is 9
	of elements (1, 2, 3, -2, 5) which 
	is a contiguous subarray.
	Example 2:
	
	Input:
	N = 4
	Arr[] = {-1,-2,-3,-4}
	Output:
	-1
	Explanation:
	Max subarray sum is -1 
	of element (-1)
 */
public class KadaneAlgorithm {
//This algo handles all cases like all negative numbers.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,-2,-3,-4};
		System.out.println(maxSubarraySum(arr, arr.length));
	}
	
	 static long maxSubarraySum(int arr[], int n){
	        
	        int maxSum=arr[0];
	        int currSum=arr[0];
	        for(int i=1; i< n; i++){
	            currSum = Math.max(arr[i], currSum+arr[i]);
	            maxSum = Math.max(currSum,maxSum);
	        }
	        return maxSum;
	    }
/*
 *   public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxiSum = nums[0];
        
        for(int i=0; i< nums.length; i++){
            currSum += nums[i];
            if(currSum> maxiSum){
                maxiSum = currSum;
            }
            if(currSum<0){
                currSum = 0;
            }
        }
        return maxiSum;
 */
}

package Array.FindDuplicates;

public class FindDuplicatesBESTSol {
//This sol produce O(n) time complexity and 0(1)space complexity
	public static void main(String[] args) {
		int[] n = { 1, 3, 4, 2, 2 };
		System.out.println(findDuplicate(n));
	}

	private static int findDuplicate(int[] nums) {
		int slow = nums[0];
		int fast = nums[0];

		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while (slow != fast);

		fast = nums[0];

		while (slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		return fast;
	}

}

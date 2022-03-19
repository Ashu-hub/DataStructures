package Array;

/*Given an integer N. The task is to find the Nth prime number.
Examples:  

Input : 5 
Output : 11

Input : 16 
Output : 53

Input : 1049 
Output : 8377 */
public class NthPimeNumber {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(findNthPrime(n));

	}

	private static int findNthPrime(int input) {
		int max = Integer.MAX_VALUE;
		int c = 0;
		if (input == 0 || input == 1) {
			return 0;
		}

		for (int i = 2; i <= max; i++) {
			if (isPrime(i)) {
				c++;
				if (c == input) {
					return i;
				}
			}
		}
		return 0;
	}

	private static boolean isPrime(int n) {

		for (int j = 2; j < n; j++) {
			if (n % j == 0) {
				return false;
			}
		}
		return true;
	}

}

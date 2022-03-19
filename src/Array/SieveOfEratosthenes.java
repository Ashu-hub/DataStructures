package Array;

import java.util.Arrays;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		System.out.println(countPrimes(3));
	}

	public static int countPrimes(int n) {
		int count = 0;
		boolean arr[] = sieveOfEratosthenes(n);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i]) {
				count++;
			}
		}
		return count;

	}

	private static boolean[] sieveOfEratosthenes(int n) {
		boolean[] arr = new boolean[n + 1];
		Arrays.fill(arr, true);
		arr[0]= false;
		if(arr.length>1) {
			arr[1]= false;
		}
		for (int i = 2; i * i <= n; i++) {
			for (int j = 2 * i; j < n; j += i) {
				arr[j] = false;
			}
		}
		return arr;
	}
}

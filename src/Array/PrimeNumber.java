package Array;

//WAP to print prime number bet 1 to n
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPrime(20);

	}

	private static void printPrime(int i) {
		for (int j = 2; j <= i; j++) {
			if (isPrime(j)) {
				System.out.print(j+" ");	
			}
		}

	}

	private static boolean isPrime(int n) {
		
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}

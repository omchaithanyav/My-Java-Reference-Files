package Math;

import java.util.Arrays;

public class SieveofEratosthenesToFindPrimes {

	
	static boolean[] SieveofEratosthenes(int n) {
		
		boolean isPrime[] = new boolean[n+1];
		
		Arrays.fill(isPrime, true);
		
		isPrime[0] = false;
		isPrime[1] = false;
		
		for(int i = 2; i*i <= n; i++) {
			for(int j = 2*i; j<=n; j += i) {
				
				isPrime[j] = false; 
			}
		}
		return isPrime;
		
	}

	public static void main(String[] args) {
		
		boolean prime[] = SieveofEratosthenes(11);
		
		for(int i = 0; i<=11; i++) {
			System.out.println(i + ": " + prime[i]);
		}
	}
}
package Problems.Problem_Solving;
import java.util.*;
public class All_twin_primes_between_1AndN {
	static boolean isPrime(int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>2) {
			return false;
		}else return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		for(int i=2;i<n;i++) {
			if(isPrime(i) && isPrime(i+2)) {
				int sum = i+2;
				count++;
				System.out.println(i+" "+sum);
			}
		}
		System.out.println("Count is: "+count);

	}

}

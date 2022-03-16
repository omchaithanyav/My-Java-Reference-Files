package Problems;
import java.util.Scanner;
public class Can_A_Number_Be_Sum_Of_2_Prime_Numbers {

	public static boolean isPrime(int n) {
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		for(int i=2; i<=num/2; i++) {
			if(isPrime(i)) {
				if(isPrime(num-i)) {
					System.out.println(num + " = "+ i + " + " + (num-i));
					flag = true;
				}
			}
		}
		if(!flag) {
			System.out.println("not possible");
		}else {
			System.out.println("Done");
		}
	}

}

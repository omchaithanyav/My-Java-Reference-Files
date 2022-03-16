package Problems;
import java.util.Scanner;
public class StrongNumber {
	
	public static int factorial(int n) {
		if(n == 0 || n == 1) return 1;
		
		return n * factorial(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		
		while(temp != 0) {
			int last_digit = temp%10;
			sum = sum + factorial(last_digit);
			temp = temp/10;
		}
		if(sum == num) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not a Strong Number");
		}
	}

}

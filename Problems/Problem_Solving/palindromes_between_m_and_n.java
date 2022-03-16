package Problems.Problem_Solving;

import java.util.Scanner;

public class palindromes_between_m_and_n {
	public static boolean isPalindrome(int n) {
		int temp = n;
		int sum = 0;
		
		while(temp!=0) {
			int last_digit = temp%10;
			sum = sum*10+last_digit;
			temp = temp/10;
	
		}
		if(sum == n) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter lower limit: ");
		int m = sc.nextInt();
		
		System.out.println("Enter upper limit: ");
		int n = sc.nextInt();
		
		for(int i=m;i<=n;i++) {
			if(isPalindrome(i)) {
				System.out.print(i+" ");
			}
		}
		
		
	}

}

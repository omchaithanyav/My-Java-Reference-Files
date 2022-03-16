package Problems;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		
		while(temp>0) {
			int last_digit = temp%10;
			sum = sum + last_digit;
			temp = temp/10;
		}
		if(num%sum == 0) {
			System.out.println("Harshad number");
		}else {
			System.out.println("Not Harshad number");
		}
	}
}

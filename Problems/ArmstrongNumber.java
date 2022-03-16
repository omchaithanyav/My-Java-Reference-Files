package Problems;
import java.util.Scanner;
public class ArmstrongNumber {
	
	public static int power(int a, int b) {
		if(b == 0) return 1;
		return a * power(a, b-1);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int temp = num;
		int armstrong_num = 0;
		
		while(temp != 0) {
			int last_digit = temp%10;
			armstrong_num = armstrong_num + power(last_digit, 3);
			temp = temp /10;
		}
		if(armstrong_num == num) {
			System.out.println(num+" is an armstrong number");
		}else {
			System.out.println(num+" is not an armstrong number");
		}

	}

}

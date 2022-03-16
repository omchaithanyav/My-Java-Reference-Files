package Problems;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		
		int rev_num = 0;
		
		while(temp != 0) {
			int last_digit = temp % 10;
			rev_num = rev_num*10 + last_digit;
			temp = temp/10;
		}
		if(rev_num == num) {
			System.out.println(num+" is a palindrome");
		}else {
			System.out.println(num+" is not a palindrome");
		}

	}

}

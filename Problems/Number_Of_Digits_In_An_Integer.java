package Problems;
import java.util.Scanner;
public class Number_Of_Digits_In_An_Integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long integer = sc.nextLong();
		
		// method 1
		String s = Long.toString(integer);
		
		int length = s.length();
		
		System.out.println(length);
		
		// method 2
		int count = 0;
		while(integer != 0) {
			count++;
			integer = integer/10;
			}
		System.out.println(count);

	}

}

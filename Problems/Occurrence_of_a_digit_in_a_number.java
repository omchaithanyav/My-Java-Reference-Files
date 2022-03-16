package Problems;
import java.util.Scanner;
public class Occurrence_of_a_digit_in_a_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x = sc.nextInt();
		int count = 0;
		
		while(num != 0) {
			int last_digit = num%10; 
			if(last_digit == x) {
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
			
	}

}

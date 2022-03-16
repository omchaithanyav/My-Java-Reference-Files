package Problems.Problem_Solving;
import java.util.*;
public class Binary_To_Decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();
		int temp = binary;
		
		int n = 0;
		int decimal = 0;
		while(temp != 0) {
			int last_digit = temp%10;
			decimal += last_digit * Math.pow(2,n++);
			temp = temp/10;
		}
		
		System.out.println(decimal);
	}

}

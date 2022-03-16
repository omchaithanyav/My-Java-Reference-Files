package Problems.Problem_Solving;
import java.util.*;
public class Octal_to_Decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int octal = sc.nextInt();
		
		int decimal = 0;
		int n = 0;
		
		while(octal != 0) {
			int last_digit = octal%10;
			decimal += last_digit * Math.pow(8,n);
			n++;
			octal = octal/10;
		}
		
		System.out.println("decimal: "+decimal);
	}

}

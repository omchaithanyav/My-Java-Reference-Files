package Problems.Problem_Solving;

import java.util.*;

public class Decimal_to_Octal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		int octal[] = new int[5];
		
		int i = 0;
		int count = 0;
		while(decimal != 0) {
			octal[i] = decimal%8;
			decimal = decimal/8;
			i++;
			count++;
		}
		
		for(int j=count-1;j>=0;j--) {
			System.out.print(octal[j]);
		}
	}

}

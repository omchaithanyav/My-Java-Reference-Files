package Problems.Problem_Solving;

import java.util.Scanner;

public class Octal_to_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int octal = sc.nextInt();
		int decimal = 0;
		
		// octal to decimal:
		int n = 0;
		while(octal != 0) {
			int last_digit = octal%10;
			decimal += last_digit*Math.pow(8,n);
			n++;
			octal /= 10;
		}
		
		// decimal to binary:
		int binary[] = new int[10];
		int count = 0;
		int i = 0;
		
		while(decimal != 0) {
			binary[i] = decimal%2;
			decimal = decimal/2;
			i++;
			count++;
		}
		
		for(int j=count-1;j>=0;j--) {
			System.out.print(binary[j]);
		}
		
		

	}

}

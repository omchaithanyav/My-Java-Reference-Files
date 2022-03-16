package Strings;

import java.util.Scanner;

public class ConvertIntToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String s = String.valueOf(n);
		
		String s0 = Integer.toString(n);
		
		// convert string to integer:
		String str = "123";
		int new_int = Integer.parseInt(str);
		System.out.println(str);
		
		System.out.println("converted String is: " + s);
		System.out.println("converted String is: " + s0);
		
	}

}

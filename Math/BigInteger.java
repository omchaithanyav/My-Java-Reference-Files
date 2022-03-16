package Math;

import java.util.Scanner;

public class BigInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger num = new BigInteger(); 
		
		java.math.BigInteger a = sc.nextBigInteger();
		java.math.BigInteger b = sc.nextBigInteger();
		
		System.out.println(a.add(b));
		System.out.println(a.divide(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		

	}

}

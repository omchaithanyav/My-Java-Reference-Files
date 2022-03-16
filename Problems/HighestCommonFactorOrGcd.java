package Problems;

import java.util.Scanner;

public class HighestCommonFactorOrGcd {
	
	public static int HCF(int a, int b) {
		if(b==0) return a;
		return HCF(b, a%b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(HCF(a,b));
		
	}

}

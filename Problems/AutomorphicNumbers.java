package Problems;

import java.util.Scanner;

public class AutomorphicNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int square = num*num;
		
		String s1 = Integer.toString(num);
		String s2 = Integer.toString(square);
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		String s3 = s2.substring(len2 - len1);
		
		if(s3.equals(s1)) {
			System.out.println(num + " is automorphic number");
		}else {
			System.out.println("Not automorphic number");
		}
		
		

	}

}

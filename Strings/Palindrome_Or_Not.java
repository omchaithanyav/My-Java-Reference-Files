package Strings;

import java.util.Scanner;

public class Palindrome_Or_Not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String str1 = "";
		
		int j = 0;
		for(int i=str.length()-1; i>=0;i--) {
			str1 = str1+str.charAt(i);
		}
		
		System.out.println("The Reverse String is: "+str1);
		if(str1.equals(str)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}

}

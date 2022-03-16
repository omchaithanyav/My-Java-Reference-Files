package Strings;

import java.util.Scanner;

public class ReverseOfAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char c[] = str.toCharArray();
		
		String revStr = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
		
			revStr += c[i]; 
		
		
	}
		System.out.println("Reversed String: " + revStr);
  }
}

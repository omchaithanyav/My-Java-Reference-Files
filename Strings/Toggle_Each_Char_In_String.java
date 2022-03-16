package Strings;

import java.util.Scanner;

public class Toggle_Each_Char_In_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String str1 = "";
		for(char ch: str.toCharArray()) {
			if(Character.isLowerCase(ch)) {
				str1 = str1+Character.toUpperCase(ch);
			}else {
				str1 = str1+Character.toLowerCase(ch);
			}
		}
		System.out.println(str1);
		

	}

}

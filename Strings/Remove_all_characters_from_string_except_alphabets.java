package Strings;
import java.util.Scanner;
public class Remove_all_characters_from_string_except_alphabets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = "";
		String str2 = "";
		
		//method 1
		str.replaceAll("[^a-zA-Z]","");
		
		//method 2
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)>64 && str.charAt(i)<=122) {
				str1 = str1+str.charAt(i);
			}
		}
		
		System.out.println(str1);
		System.out.println(str2);
		}
	}


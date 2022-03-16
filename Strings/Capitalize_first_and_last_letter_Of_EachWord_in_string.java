package Strings;
import java.util.Scanner;
public class Capitalize_first_and_last_letter_Of_EachWord_in_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String new_str = "";
		
		String s[] = str1.split(" "); // splitting sentence into word converted to String array
		
		for(String str: s) {
			String firstChar = Character.toString(str.charAt(0));
			String lastChar = Character.toString(str.charAt(str.length()-1));
			String rest = str.substring(1,(str.length()-1));
			new_str = new_str+firstChar.toUpperCase()+rest+lastChar.toUpperCase()+" ";
		}
		System.out.println(new_str);
		
	}

}

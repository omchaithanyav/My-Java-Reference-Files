package Strings;
import java.util.*;
public class Remove_vowel_from_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		
		str = str.replaceAll("[aeiou]","");
		System.out.println(str);
	}

}

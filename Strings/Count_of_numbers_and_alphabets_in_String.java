package Strings;
import java.util.*;
public class Count_of_numbers_and_alphabets_in_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) count1++;  // Character.isAlphabetic returns true if the char at i is alphabet
			if(Character.isDigit(str.charAt(i))) count2++;		// Character.isDigit returns true if the char at i is integer
			if(Character.isLetter(str.charAt(i))) count3++;		// Character.isLetter returns true if the char at i is alphabet
			if(!(Character.isDigit(str.charAt(i))) && !(Character.isAlphabetic(str.charAt(i)))) count4++;     // count of other special characters
		}
		System.out.println(count1+" "+count2+" "+count3+" "+count4);

	}

}

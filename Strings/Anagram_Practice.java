package Strings;
import java.util.Scanner;
public class Anagram_Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		int aIndex[] = new int[256];
		int bIndex[] = new int[256];
		
		if(s1.length() == s2.length()) {
		
			for(char ch: s1.toCharArray()) {
				int index = ch;
				aIndex[index]++;
			}
		
			for(char ch: s2.toCharArray()) {
				int index = ch;
				bIndex[index]++;
			}
		
		
			boolean isAnagram = true;
			for(int i=0;i<aIndex.length;i++) {
				if(aIndex[i] != bIndex[i]) {
					isAnagram = false;
					break;
				}
			}
		
			if(isAnagram) {
				System.out.println("Anagrams");
			}else {
				System.out.println("Not Anagrams");
			}
	}else {
		System.out.println("Length not match, Not Anagrams");
	}

	}

}

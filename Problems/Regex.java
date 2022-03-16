package Problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		Pattern pattern = Pattern.compile("BABYDOLL", Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher(str);
		
		boolean matcherFound = matcher.find();
		
		if(matcherFound) {
			System.out.println("Yes");
		}else {
			System.out.println("no");
		}

	}

}

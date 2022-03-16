package Strings;
import java.util.*;
public class count_of_unique_years_in_stringDoc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();
		
		String str1 = "";
		HashSet<String> dates = new HashSet<String>();
		
		for(int i=0;i<len;i++) {
			if(Character.isDigit(str.charAt(i))){
				str1 += str.charAt(i);
			}
			
			if(str.charAt(i)=='-') {
				str1="";
			}
			
			if(str1.length() == 4) {
				dates.add(str1);
			}
		}
		
		System.out.println(dates.size());

	}

}

package Strings;
import java.util.*;
public class Remove_Spaces_In_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String str1 = "";
		String str2 = "";
		
		//Method 1
		str2 = str.replaceAll("[ ]","");
		
		//Method 2
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==' ') {
				str1 = str1+"";
			}else {
				str1 = str1+str.charAt(i);
			}
		}
		
		System.out.println(str1);
		System.out.println(str2);

	}

}

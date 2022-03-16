package Strings;
import java.util.*;
public class subString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String ss = sc.next();
		
		if(s.contains(ss)==true) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}

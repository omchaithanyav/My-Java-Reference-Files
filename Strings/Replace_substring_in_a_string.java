package Strings;
import java.util.Scanner;
public class Replace_substring_in_a_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string ");
		String str1 = sc.nextLine();
		System.out.println("Enter the string that you want to replace ");
		String str2 = sc.nextLine();
		System.out.println("Enter the string that you want to replace with ");
		String str3 = sc.nextLine();
		
		str1 = str1.replace(str2, str3);
		
		System.out.println(str1);

	}

}

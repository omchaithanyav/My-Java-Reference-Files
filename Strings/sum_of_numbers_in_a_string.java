package Strings;
import java.util.Scanner;
public class sum_of_numbers_in_a_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int sum = 0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))){
				sum = sum + Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(sum);

	}

}
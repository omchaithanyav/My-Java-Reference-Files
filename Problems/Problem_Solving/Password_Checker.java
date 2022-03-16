package Problems.Problem_Solving;
import java.util.Scanner;
public class Password_Checker {
	
	public static int CheckPassword(String str, int n) {
		
		if(n<4) {
			return 0;
		}
		if(str.charAt(0)>='0' && str.charAt(0)<='9') return 0;
		
		int count1 = 0;
		int count2 = 0;
		
		for(int i=0;i<n;i++) {
			if(str.charAt(i) == ' ' || str.charAt(i) == '/') {
				return 0;
			}
			if(str.charAt(i)>='0' && str.charAt(i)<='9') count1++;
			if(str.charAt(i)>='A' && str.charAt(i)<='z') count2++;
		}
		if(count1>0 && count2>0) {
			return 1;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		String str = "Xa#$_32b9";
		System.out.println(CheckPassword(str, str.length()));
	}	
}

package Problems;
import java.util.Scanner;
public class Replace_All_0_With_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String s = Integer.toString(num);
		String s1 ="";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '0') {
				s1 = s1 + '1';
			}else {
				s1 = s1 + s.charAt(i);
			}
		}
		System.out.println(s1);

	}

}

package Problems;
import java.util.*;
public class reverse_a_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev_str = "";
		
		for(int i=str.length()-1; i>=0;i--) {
			rev_str = rev_str+str.charAt(i);
		}
		
		System.out.println(rev_str);

	}

}

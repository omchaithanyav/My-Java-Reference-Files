package Problems;
import java.util.*;
public class stars_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=i;j<num;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
		}
	}
}

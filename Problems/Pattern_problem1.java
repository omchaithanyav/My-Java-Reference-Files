package Problems;
import java.util.Scanner;
public class Pattern_problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[][] arr = new char[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0; j<3;j++) {
				if((i==0) && (j==0 || j==2)) arr[i][j] = str.charAt(i);
				if((i==2) && (j==0 || j==2)) arr[i][j] = str.charAt(i);
				if((i==1) && j==1) arr[i][j] = str.charAt(i);
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}		
	}
}

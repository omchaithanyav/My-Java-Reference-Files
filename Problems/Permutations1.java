package Problems;
import java.util.Scanner;
public class Permutations1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int people = sc.nextInt();
		int seats = sc.nextInt();
		int result = 1;
		
		for(int i=seats; i>0; i--) {
			result = result*people;
			people--;
		}
		System.out.println(result);
	}

}

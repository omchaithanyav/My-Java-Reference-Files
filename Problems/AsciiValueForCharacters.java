package Problems;
import java.util.Scanner;
public class AsciiValueForCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		int i = c;
		System.out.println("ASCII value for char "+c+" is "+i);
	}

}

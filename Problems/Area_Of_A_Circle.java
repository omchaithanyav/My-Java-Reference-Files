package Problems;
import java.util.Scanner;
public class Area_Of_A_Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextInt();
		
		double area = 3.14 * radius * radius;
		
		System.out.println(area);
	}

}

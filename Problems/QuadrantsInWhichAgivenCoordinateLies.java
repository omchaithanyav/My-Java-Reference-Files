package Problems;

import java.util.Scanner;

public class QuadrantsInWhichAgivenCoordinateLies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>=0 && b>=0) System.out.println("Quadrant1");
		if(a>=0 && b<0) System.out.println("Quadrant4");
		if(a<0 && b>=0) System.out.println("Quadrant2");
		if(a<0 && b<0) System.out.println("Quadrant3");
		

	}

}

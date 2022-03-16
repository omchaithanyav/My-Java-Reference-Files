package Problems;
import java.util.Scanner;
public class Roots_Of_Quadratic_Equation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coefficients");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double determinant = (Math.pow(b,2)-(4*a*c));
		
		if(determinant>0) {
			System.out.println("The roots are "+ ((-b+Math.sqrt(determinant))/2*a)+" and "+((-b-Math.sqrt(determinant))/2*a));
		}else if(determinant == 0) {
			System.out.println("The root is "+(-b/2*a));
		}else {
			System.out.println("Roots are "+ -b/(2*a) + "+i" + Math.sqrt(-determinant)/(2*a) + "and" + -b/(2*a) + "-i"+ Math.sqrt(-determinant)/(2*a));
		}
		
		
	}

}

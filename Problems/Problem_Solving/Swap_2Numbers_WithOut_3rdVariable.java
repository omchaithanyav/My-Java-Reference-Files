package Problems.Problem_Solving;
import java.util.Scanner;
public class Swap_2Numbers_WithOut_3rdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Before Swap a: "+a+" b: "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("after Swap a: "+a+" b: "+b);
	}

}

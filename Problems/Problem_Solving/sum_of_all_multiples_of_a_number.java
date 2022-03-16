package Problems.Problem_Solving;
import java.util.Scanner;
public class sum_of_all_multiples_of_a_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1;i<=10;i++) {
			int prod = n*i;
			System.out.print(prod+" ");
			sum = sum+prod;
		}
		System.out.println();
		System.out.println("sum: "+sum);

	}

}

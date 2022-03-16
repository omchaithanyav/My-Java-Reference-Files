package Problems;
import java.util.Scanner;
public class FibonacciSeriesUptoNthTerm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the nth term: ");
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
	
		int c = 0;
		if(n>0) {
			System.out.print("Fibonacci Series : "+a+" "+b+" ");
			while(c<=n) {
					c = a+b;
					a = b;
					b = c;
					if(c <= n) System.out.print(c+" ");
				}	
			}else {
				System.out.println("Enter a positive integer");
			
		}
	 }
}
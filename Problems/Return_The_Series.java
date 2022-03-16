package Problems;

import java.util.Scanner;

public class Return_The_Series {  // Example: User enters 3 numbers and they are: 1, 4, 7 now we have to return: 5, 9, 16 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		b[0] = a[0] + a[1];
		for(int i=1; i<=n-1; i++) {
			b[i] = b[i-1] + a[i];
		}
		for(int i=0; i<n; i++) {
			System.out.print(b[i]+" ");
		}

	}

}

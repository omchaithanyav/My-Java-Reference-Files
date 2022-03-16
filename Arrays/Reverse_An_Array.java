package Arrays;

import java.util.Scanner;

public class Reverse_An_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int a[] = new int[size];
		int b[] = new int[size];
		for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
			//b[size-i-1] = a[i];   // method 1
		}
		
		int j = 0;
		for(int i=size-1; i>=0; i--) {
			b[j] = a[i];							// method 2
			j++;
		}
		
		for(int i=0; i<size; i++) {
			System.out.print(b[i]+" ");
		}
		
		
	
		
		

	}

}

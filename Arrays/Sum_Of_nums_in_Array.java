package Arrays;

import java.util.Scanner;

public class Sum_Of_nums_in_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		int a[] = new int[length];
		int sum = 0;
		
		for(int i=0; i<length; i++) {
			a[i] = sc.nextInt();
			sum = sum+a[i];
		}
		
		System.out.println("The sum of elements in given array is: " + sum);
		
		
		
	}

}

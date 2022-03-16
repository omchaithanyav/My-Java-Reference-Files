package Arrays;

import java.util.Scanner;

public class Number_Of_Even_And_Odd_In_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int a[] = new  int[len];
		
		int even_count = 0;
		int odd_count = 0;
		
		for(int i=0;i<len;i++) {
			a[i] = sc.nextInt();
			if(a[i]%2 == 0) {
				even_count++;
			}else {
				odd_count++;
			}
		}
		System.out.println("Number of evens are: "+even_count+" and Number of odds are: "+odd_count);
		}
}

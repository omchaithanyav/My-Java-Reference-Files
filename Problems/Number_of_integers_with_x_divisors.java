package Problems;

import java.util.Scanner;

public class Number_of_integers_with_x_divisors {
	
	public static int divisors(int num) {
		int count1 = 0;
		for(int i=1; i<=num; i++) {
			if(num%i == 0) count1++;
		}
		return count1;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int count2 = 0;
		System.out.println("The numbers that have "+x+" divisors are: ");
		for(int i=1; i<=n; i++) {
			if(divisors(i) == x) {
				System.out.println(i);
				count2++;
			}
		}
		System.out.println("The count is "+count2);
		
	}

}

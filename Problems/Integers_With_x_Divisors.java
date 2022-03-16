package Problems;

import java.util.Scanner;

public class Integers_With_x_Divisors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int count2 = 0;
		
		for(int i=1;i<=100;i++) {
			int count1 = 0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count1++;
				}
			}
			if(count1 == x){
				System.out.println(i+" has "+x+" divisors");
				count2++;
			}
		}
		System.out.println("The count is: "+count2);

	}

}

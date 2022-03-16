package Problems;

import java.util.Scanner;

public class ArmstrongInGivenRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		int last = sc.nextInt();
		
		int count = 0;
	
		for(int i=first; i<=last; i++) {
			int sum = 0;
			int temp = i;
			
			while(temp != 0) {
				int last_digit = temp%10;
				sum = sum + (last_digit*last_digit*last_digit);
				temp = temp/10;
			}
			if(sum == i) {
				count = count+1;
				System.out.println(i);
			}
		}
		System.out.println("Total armstrong numbers between "+first+" and "+last+" are "+count);
		

	}

}

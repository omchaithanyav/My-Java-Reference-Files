package Problems;

import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<num; i++) {
			if(num%i == 0) {
				sum += i;
			}
		}
		if(num<sum){
			System.out.println(num+" is Abundant Number");
		}else {
			System.out.println(num+" is not Abundant Number");
		}
		

	}

}

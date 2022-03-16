package Problems;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a>b? a:b;
		
		int i = c;
		
		while(i<=a*b) {
			if(i%a==0 && i%b==0) {
				break;
			}
			
			i = i+c;
		}
		System.out.println(i);
		

	}

}

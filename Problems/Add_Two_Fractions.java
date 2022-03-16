package Problems;
import java.util.Scanner;
public class Add_Two_Fractions {
	
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b,a%b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
			
		int num1 = sc.nextInt();
		int den1 = sc.nextInt();
		int num2 = sc.nextInt();
		int den2 = sc.nextInt();
		
		if(den1 == den2) {
			num1 = num1+num2;
			den1 = den1;
		}else {
			num1 = num1*den2;
			num2 = num2*den1;
			num1 = num1+num2;
			den1 = den1*den2;
		}
		int hcf = gcd(num1, den1);
		num1 = num1/hcf;
		den1 = den1/hcf;
		
		System.out.println(num1+"/"+den1);
	}

}

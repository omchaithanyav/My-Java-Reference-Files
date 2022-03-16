package Problems;
import java.util.Scanner;
public class FriendlyPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=1; i<=num1/2; i++) {
			if(num1%i == 0){
				sum1 = sum1+i;
			}
		}
		for(int i=1; i<=num2/2; i++) {
			if(num2%i == 0) {
				sum2 = sum2+i;
			}
		}if(sum1==num2 && num2==sum1){
			System.out.println("Friendly Pair");
		}else {
			System.out.println("Not Friendly Pair");
		}
		
	}

}

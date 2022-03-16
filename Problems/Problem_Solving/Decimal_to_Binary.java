package Problems.Problem_Solving;
import java.util.*;
public class Decimal_to_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		int binary[] = new int [15];
		
		int i = 0;
		int count = 0;
		while(decimal != 0) {
			
			binary[i] = decimal%2;
			decimal = decimal/2;
			i++;
			count++;
			
		}
		for(int j=count-1; j>=0; j--) {
			System.out.print(binary[j]);
		}
	}

}

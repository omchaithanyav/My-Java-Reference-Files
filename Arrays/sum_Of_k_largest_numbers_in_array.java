package Arrays;
import java.util.*;
public class sum_Of_k_largest_numbers_in_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = {13,3,7,43,17,8,1,10};
		int k = sc.nextInt();
		int sum = 0;
		
		
		Arrays.sort(a);
		for(int i=a.length-1;i>=a.length-k;i--) {
			sum += a[i];
		}
		System.out.println(sum);
	}
}

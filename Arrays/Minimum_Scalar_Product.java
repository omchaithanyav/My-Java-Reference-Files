package Arrays;
import java.util.Scanner;
public class Minimum_Scalar_Product extends Sorting_Array_In_Ascending_and_Descending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int a[] = new int[len];
		int b[] = new int[len];
		
		System.out.println("Enter First Array: ");
		for(int i=0; i<len;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter second Array: ");
		for(int i=0;i<len;i++) {
			b[i] = sc.nextInt();
		}
		sort_array_asc(a, len);
		sort_array_desc(b, len);
		
		int sum = 0;
		
		for(int i=0;i<len;i++) {
			sum = sum + a[i]*b[i];
		}
		System.out.println(sum);
	}

}

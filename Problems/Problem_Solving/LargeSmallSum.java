package Problems.Problem_Solving;
import java.util.Arrays;
public class LargeSmallSum {
	public static int sum(int a[], int len) {
		Arrays.sort(a);
		if(len<=3) return 0;
		
		if(len%2==0) {
			return a[len-4]+a[3];
		}else {
			return a[len-3]+a[3];
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {1, 8, 0, 2, 3, 5, 6};
		System.out.println(sum(arr, arr.length));
	}

}

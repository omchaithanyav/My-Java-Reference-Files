package Problems.Problem_Solving;
import java.util.Arrays;
public class Product_Smallest_Pair {
	public static int ProductSmallestPair(int sum, int a[]) {
		if(a.length<2) return -1;
		
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			if(a[i]+a[i+1] <= sum) {
				return a[i]*a[i+1];
			}
		}
		return 0;
		
	}
	public static void main(String[] args) {
		
		int a[] = {9, 8, 3, -7, 3, 9};
		System.out.println(ProductSmallestPair(9, a));
	}

}

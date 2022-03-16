package Problems.Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class find_Median_in_an_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int a[] = new int[len];
		for(int i=0;i<len;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		float median = 0;
		if(len%2 != 0) {
			median = median+a[len/2];
		}else if(len%2 == 0) {
	
			median = (float) (median+(a[len/2] + a[(len/2)-1])/2.0);
		}
		System.out.println(median);

	}

}

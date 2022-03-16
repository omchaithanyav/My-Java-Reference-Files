package Arrays;
import java.util.*;
public class Maximum_Scalar_Product {
	public static int [] sorting(int a[], int len) {
		for(int i=0;i<len-1;i++) {
			boolean swapped = false;
			for(int j=0;j<len-i-1;j++) {
				if(a[j+1]<a[j]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped==false) {
				break;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int a[] = new int[len];
		int b[] = new int[len];
		
		for(int i=0;i<len;i++) {
			a[i] = sc.nextInt();		
		}
	
		for(int i=0;i<len;i++) {
			b[i] = sc.nextInt();		
		}
		sorting(a, len);
		sorting(b, len);
		
		int sum = 0;
		for(int i=0;i<len;i++) {
			sum = sum + a[i]*b[i];
		}
		
		System.out.println(sum);
	}	
}



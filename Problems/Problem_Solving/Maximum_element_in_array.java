package Problems.Problem_Solving;
import java.util.Scanner;
public class Maximum_element_in_array {
	public static void MaxInArray(int a[], int len) {
		int maxIndex = 0;
		for(int i=1;i<len;i++) {
			if(a[maxIndex]<a[i]) {
				maxIndex = i;
			}
		}
		System.out.println(a[maxIndex]);
		System.out.println(maxIndex);
	}
	public static void main(String[] args) {
		int a[] = {23, 45, 182, 27, 66, 12, 78, 13, 71, 86};
		MaxInArray(a, a.length);
	}

}

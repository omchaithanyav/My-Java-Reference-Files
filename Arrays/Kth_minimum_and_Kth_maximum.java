package Arrays;
import java.util.*;
public class Kth_minimum_and_Kth_maximum {
	
	static void kthMinMax(int arr[], int k) {
		
		Arrays.sort(arr);
		System.out.println(k+"th maximum: "+arr[arr.length-k]);
		System.out.println(k+"th minimum: "+arr[k-1]);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter k");
		int k = sc.nextInt();
		
		int arr[] = {98,74,103,17,-3,21,9,93};
		
		kthMinMax(arr,k);

	}

}

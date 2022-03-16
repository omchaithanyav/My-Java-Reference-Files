package Arrays;
import java.util.*;
public class Subarray_with_0_sum {

	public static void main(String[] args) {
		int arr[] = {4,2,-6};
		int len = arr.length;
		
		HashSet<Integer> hs = new HashSet<Integer>();
		int sum = 0;
		
		boolean found = false;
		for(int i=0;i<len;i++) {
			hs.add(sum);
			sum += arr[i];
			
			if(hs.contains(sum)) found = true;
		}
		if(found) {
			System.out.println("True");
		}else{
			System.out.println("False");
		}

	}

}

package Arrays;
import java.util.Arrays;
public class Two_Sum {

	public static void main(String[] args) {
		int arr[] = {2,13,4,3,-4,0,-1};
		int x = 16;
		
		Arrays.sort(arr);
		
		boolean found = false;
		int i=0; int j=arr.length-1;
		while(i<j) {
			if((arr[i]+arr[j]) < x) i++;
			else if((arr[i]+arr[j]) > x) j--;
			else {
				found = true;
				break;
			}			
		}
		if(found) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
	}
}

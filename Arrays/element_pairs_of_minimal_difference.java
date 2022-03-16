package Arrays;
import java.util.*;
public class element_pairs_of_minimal_difference {

	static void solution(int arr[]) {
		Arrays.sort(arr);
		
		int min = arr[1]-arr[0];
		for(int i=0;i<arr.length-1;i++) {
			int dif = arr[i+1]-arr[i];
			
			if(dif<min) {
				min = dif+min;
				dif = min-dif;
				min = min-dif;
			}
		}
		for(int i=0;i<arr.length-1;i++) {
			if((arr[i+1]-arr[i])==min) {
				System.out.println(arr[i]+" "+arr[i+1]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {4, 2, 1, 3};
		solution(arr);
	}

}

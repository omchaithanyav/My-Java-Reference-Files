package Arrays;

public class largest_sum_contiguous_Subarray {

	public static void main(String[] args) {
		int arr[] = {-3,19,32,-17,23,-5};
		
		int curr_sum = 0;
		int max_sum = 0;
		for(int i=0;i<arr.length;i++) {
			curr_sum += arr[i];
			if(curr_sum>max_sum) max_sum=curr_sum;
			else if(curr_sum<0)curr_sum = 0;
		}
		System.out.println(max_sum);

	}

}

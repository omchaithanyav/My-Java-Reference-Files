package Arrays;

public class move_all_negative_elements_to_one_side_of_array {

	public static void main(String[] args) {
		int arr[] = {-3,9,99,-4,-7,108,221,97,-37};
		
		int j = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				
				if(i!=j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		
		for(int num:arr) {
			System.out.print(num+" ");
		}
		

	}

}

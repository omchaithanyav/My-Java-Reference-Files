package Arrays;

public class Cyclically_Rotate_an_Array_by_one {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,12,37};
		int len = arr.length;
		
		int temp = arr[len-1];
		for(int i=len-2; i>=0;i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = temp;
		
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}
}

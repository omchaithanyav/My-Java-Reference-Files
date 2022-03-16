package Arrays;

public class Smallest_and_Largest_num_in_array {
	public static int[] sort_array(int a[], int n) {
		boolean swaped = false;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(a[j+1]<a[j]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swaped = true;
				}
			}if(!swaped) break;
		}return a;
	}
	public static void main(String[] args) {
		int a[] = {7,5,-3,2,190,99,-33};
		sort_array(a, a.length);
		
		System.out.println("Smallest element in given array: "+a[0]);
		System.out.println("Second smallest element in given array: "+a[1]);
		
		System.out.println("Largest element in given array: "+a[a.length-1]);
	}

}

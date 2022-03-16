package Arrays;

public class Sorting_Array_In_Ascending_and_Descending {
	
	public static int[] sort_array_asc(int a[], int n) {
		for(int i = 0; i < n-1; i++) {
			boolean swapped = false;
				for(int j = 0; j < n-i-1; j++) {
				
					if(a[j+1] < a[j]) {
					
						int temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					
						swapped = true;
					}
				}
		
				if(!swapped) break;
			}return a;
		}
	
	public static int[] sort_array_desc(int a[], int n) {
		
		for(int i=0; i<n-1; i++) {
			boolean swapped = false;
			for(int j=0; j<n-i-1; j++) {
				if(a[j+1] > a[j]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapped = true;
				}
			}if(!swapped) {
				break;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int a[] = {7,9,2,13,-4,4,-1};
		int n = a.length;
		sort_array_asc(a, n);
		//sort_array_desc(a, n);
		
		for(int num: a) {
			System.out.print(num+" ");
		}
		
	}

}

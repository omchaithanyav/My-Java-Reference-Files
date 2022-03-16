package Arrays;

public class Sort_1stHalfInAscending_2ndHalfInDescending {
	
	public static int[] sort_array(int a[], int n) {
		for(int i=0; i<n-1; i++) {
			int minInd = i; 
			for(int j=i+1; j<n; j++) {
				if(a[j]<a[minInd]) {
					minInd = j;
				}
			}
			if(minInd != i) {
				int temp = a[i];
				a[i] = a[minInd];
				a[minInd] = temp;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int a[] = {7,9,2,13,4,-7};
		int n = a.length;
		int mid = n/2;
		
		sort_array(a, n);
		
		// printing 1st half in ascending order:
		for(int i=0; i<mid; i++) {
			System.out.print(a[i]+" ");
		}
		
		//printing next half in descending order:
		for(int i=n-1; i>=mid; i--) {
			System.out.print(a[i]+" ");
		}

	}

}

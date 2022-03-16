package Arrays;

public class duplicates_within_RangeK {

	public static void main(String[] args) {
		int arr[] = {3,7,6,9,99,7,-2,21};
		int k = 4; int n = arr.length;
		boolean found = false;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(found==false && arr[i]==arr[j] && (j-i) <= k) {
					System.out.println("Found");
					found = true;
				}
			}
		}
		if(!found) System.out.println("Not Found");
		
	}

}

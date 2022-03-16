package Problems.Problem_Solving;

public class Problem_4 {  // return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’.
	
	public static int function(int arr[], int len, int num, int diff) {
		if(arr.length == 0) return -1;
		
		int count = 0;
		for(int i=0;i<len;i++) {
			if((Math.abs(arr[i]-num) <= diff)) {
				count ++;
			}
		}
		if(count>0) {
			return count;
		}else {
			return -1;
		}
	}
	public static void main(String[] args) {
		int a[] = {12, 3, 14, 56, 77, 13};
		System.out.println(function(a, a.length, 13, 2));
	}

}

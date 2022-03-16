package Arrays;

public class maxNum_Without_Sorting {
	
	static  int max_in_arr(int arr[]){
		if(arr.length==0) return -1;
		
		int maxInd = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[maxInd]<arr[i]) maxInd = i;
		}
		return arr[maxInd];
	}
	
	public static void main(String[] args) {
		int a[] = {12,-1,98,182,-99,16,29};
		
		System.out.println(max_in_arr(a));
	}

}

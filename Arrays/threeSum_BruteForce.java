package Arrays;

import java.util.Scanner;

public class threeSum_BruteForce {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {32,-1,27,19,4,-3,97,32};
		int len = arr.length;
		int x = sc.nextInt();
		boolean found = false;
		
		for(int i=0;i<len-2;i++) {
			for(int j=1;j<len-1;j++) {
				for(int k=2;k<len;k++) {
					if(arr[i]+arr[j]+arr[k] == x) {
						found = true;
					}
				}
			}
		}
		if(found) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
		
		

	}

}

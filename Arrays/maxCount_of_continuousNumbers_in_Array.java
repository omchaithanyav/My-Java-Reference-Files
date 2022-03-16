package Arrays;

import java.util.Scanner;
import java.util.*;
public class maxCount_of_continuousNumbers_in_Array {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = sc.nextInt();
		int arr[] = new int [size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int max_count = 0;
		int curr_count = 1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] == arr[i-1]+1) {
				curr_count++;
			}else {
				curr_count = 1;
			}
			if(curr_count>max_count) max_count = curr_count;
		}
		
		System.out.println(max_count);
	}
}

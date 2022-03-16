package Problems.Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_15 {
 
	public static void main(String[] args) { //You are required to input the size of the matrix then the elements of matrix, then you have to divide the main matrix in two sub matrices (even and odd) in such a way that element at 0 index will be considered as even and element at 1st index will be considered as odd and so on. then you have sort the even and odd matrices in ascending order then print the sum of second largest number from both the matrices
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter the size of array");
		
		int size = sc.nextInt();
		
		int even[] = new int[size];
		int odd[] = new int[size];
		
		System.out.println("enter element at 0 index: ");
		even[0] = sc.nextInt();
		
		for(int i=1;i<size;i++) {
			System.out.println("enter element at "+i+" index: ");
			int val = sc.nextInt();
			
			if(val%2==0) {
				even[i] = val;
			}else if(val%2 != 0) {
				odd[i] = val;
			}
		}
		Arrays.sort(even);
		Arrays.sort(odd);
		
		System.out.println(even[size-2]+odd[size-2]);
	}

}

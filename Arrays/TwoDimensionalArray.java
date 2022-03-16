package Arrays;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int arr1 [] [] = new int [3] [3];
	  //int arr2 [] [] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				
				arr1[i][j] = sc.nextInt();
				
			}

		}
		
		for(int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				
				System.out.print(arr1[i][j] + " ");
				
			}
              
			System.out.println();
	}

}
}
	

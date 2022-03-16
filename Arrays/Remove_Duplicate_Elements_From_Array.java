package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Remove_Duplicate_Elements_From_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int a[] = new int[len];
		
		for(int i=0;i<len;i++) {
			a[i] = sc.nextInt();
		}
		
		int visited = -1;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(a[i]==a[j] && i != j) {
					a[j] = visited;
				}
			}
			if(a[i] != visited) {
				System.out.println(a[i]);
			}
		}
		
	}

}

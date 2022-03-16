package Arrays;
import java.util.Scanner;
public class Frequency_of_nums_in_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int visited_arr[] = new int[arr.length];
		int visited = -1;
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int count = 1;
			for(int j=i+1; j<n;j++) {
				if(arr[j]==arr[i]){
					count++;
					visited_arr[j] = visited;
				}
			}
			if(visited_arr[i] != visited) {
				visited_arr[i] = count;
			}
		}	
	for(int i=0;i<visited_arr.length;i++) {
		if(visited_arr[i] != visited) {
			System.out.println("The frequency of "+arr[i]+" is "+visited_arr[i]);
		}
	}
  } 
}
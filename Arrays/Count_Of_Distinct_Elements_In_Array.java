package Arrays;

public class Count_Of_Distinct_Elements_In_Array {

	public static void main(String[] args) {
		int arr[] = {1,2,1,2,1,3,4,4,3,2,7,8,8,9,0,1};
		int len = arr.length;
		
		int visited_arr[] = new int[len];
		int visited = -1;
		
		for(int i=0;i<len;i++) {
			for(int j=i+1; j<len;j++) {
				if(arr[i]==arr[j]) {
					visited_arr[j] = visited;
				}
			}
		}
		System.out.print("The distinct elements are: ");
		
		int count = 0;
		for(int i=0;i<len;i++) {
			if(visited_arr[i] != -1) {
				System.out.print(arr[i]+" ");
				count ++;
			}
		}
		System.out.println();
		System.out.println("count is: "+count);
	}

}

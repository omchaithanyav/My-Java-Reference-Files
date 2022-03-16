package Arrays;
import java.util.Scanner;
public class Repeating_Elements_In_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int a[] = new int[len];
		
		for(int i=0;i<len;i++) {
			a[i] = sc.nextInt();
		}
		int visited = -1;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(a[i]==a[j] && i != j && a[j] != visited) {
					System.out.println(a[i]);
					a[j] = visited;
				}
			}
		}

	}

}

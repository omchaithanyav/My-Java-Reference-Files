package Problems.Problem_Solving;
import java.util.Scanner;
public class Rat_Count_House {
	
	public static int RatProblem(int r, int unit, int a[]) {
		int Total_Food = r*unit;
		
		if(a.length == 0) return -1;
		
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
			if(sum>=Total_Food) {
				return i+1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int a[] = {3,4,2,9,5,0,-3};
		System.out.println(RatProblem(7,3,a));
	}

}


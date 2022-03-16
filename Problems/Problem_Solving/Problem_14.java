package Problems.Problem_Solving;

public class Problem_14 {  // sum of numbers divisible both by 3 and 5, between ‘m’ and ‘n’ both inclusive
	
	public static int calculate(int m, int n) {
		int sum = 0;
		for(int i=m;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				sum = sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(calculate(100,160));

	}

}

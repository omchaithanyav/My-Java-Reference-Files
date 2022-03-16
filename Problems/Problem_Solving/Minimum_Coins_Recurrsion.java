package Problems.Problem_Solving;

public class Minimum_Coins_Recurrsion {

	public static void main(String[] args) {
		
		int arr[] = {5,7,1};
		int N = 18;
		
		System.out.println(minCoins(N,arr));
	}
	
	static int minCoins(int n, int a[]) {
		
		if(n==0) return 0;
		
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(n-a[i]>=0) {
				int subAns = minCoins(n-a[i],a);
				
				if(subAns+1 != Integer.MAX_VALUE && subAns+1<ans) {
					ans = subAns+1;
			}
		}
	}
		return ans;
  }
}

package Problems.Problem_Solving;
public class Prime_Number_Difference {
	public static boolean isPrime(int n) {
		if(n<2) return false;
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>2) {
			return false;
		}else return true;
	}

	public static void main(String[] args) {
		int a[] = {1,5,3,4,2};
		int size = a.length;
		int count = 0;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(isPrime(a[i]-a[j])==true && j!=i) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}

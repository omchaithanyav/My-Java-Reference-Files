package Problems.Problem_Solving;

public class Autobiographical_Number {
	public static int FindAutoCount(String n) {
		if(n.length()==0) return 0;
		
		int a = Integer.parseInt(n.charAt(0)+"");
		int b = Integer.parseInt(n.charAt(1)+""); 
		int count1 = 0;
		int count2 = 0;
		
		for(int i=0;i<n.length();i++) {
			if(n.charAt(i)=='0') count1++;
			if(n.charAt(i)=='1') count2++;
			}
		int count = 0;
		boolean visited[] = new boolean[n.length()];
		if(a==count1 && b==count2) {
			for(int i=0;i<n.length();i++) {
				for(int j=i+1;j<n.length();j++) {
					if(n.charAt(i)==n.charAt(j) && i!=j) {
						visited[j] = true;
					}
				}
			}
	}else return 0;
		for(int i=0;i<n.length();i++) {
			if(visited[i]!=true) {
				count++;
			}
		}
		return count;
}
	public static void main(String[] args) {
		System.out.println(FindAutoCount("1393011"));

	}

 
}

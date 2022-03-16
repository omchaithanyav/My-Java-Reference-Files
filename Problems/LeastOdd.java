package Problems;

import java.util.*;

public class LeastOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		while(true) {
			
			int a = sc.nextInt();
			if(a<0) {
				break;
			}else {
				al.add(a);
			}
		}
		
		Collections.sort(al);
		
		boolean odd_is_there = false;
		int b = 0;
		for(int i = 0; i<al.size(); i++) {
			
			if(al.get(i)%2 != 0) {
				b = b + al.get(i);
				odd_is_there = true;
				break;
			}
		}
		
		if(odd_is_there == true) {
			System.out.println(b);
		}else {
			System.out.println(0);
		}
	}
		
		
		

}



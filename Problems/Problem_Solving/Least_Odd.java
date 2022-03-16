package Problems.Problem_Solving;
import java.util.ArrayList;
import java.util.Scanner;
public class Least_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		while(true) {
			int ele = sc.nextInt();
			if(ele>0 && ele%2 != 0) {
				al.add(ele);
			}else if(ele<0){
				break;
			}
		}
		if(al.isEmpty()==false) {
		int min_odd_Ind = 0;
		for(int i=0;i<al.size();i++) {
			if(al.get(min_odd_Ind)>al.get(i)) {
				min_odd_Ind = i;
			}
		}
		System.out.println(al.get(min_odd_Ind));
	}else {
		System.out.println(0);
	}
		
	}
}
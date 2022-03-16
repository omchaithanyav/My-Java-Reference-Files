package ArrayList;
import java.util.*;
public class maximum_Toys {
	
	public static int maximumToys(List<Integer> prices, int k) {
        
	        Collections.sort(prices);
	        int count=0;
	        int sum=0;
	        for(int i=0;i<prices.size();i++){
	            sum = sum+prices.get(i);
	            if(sum<=k) {
	            	count++;
	            }
	        }
	        return count;
	     }
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(3); l.add(35); l.add(32); l.add(79); l.add(13); l.add(1); l.add(103);
		System.out.println(maximumToys(l, 100));
	}
}

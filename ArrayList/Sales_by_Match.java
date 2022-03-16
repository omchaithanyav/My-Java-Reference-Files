package ArrayList;
import java.util.*;
public class Sales_by_Match {
	
	public static void main(String[] args) {   //https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(10); arr.add(20); arr.add(31); arr.add(11); arr.add(31); arr.add(31); arr.add(10); 
		arr.add(10); arr.add(11); arr.add(10); arr.add(20);
		
		System.out.println(sockMerchant(arr));
	}
	
	public static int sockMerchant(List<Integer> ar) {
	    Collections.sort(ar);
	    int len=ar.size();
	    int i=0;
	    int count=0;
	    while(i<len-1){
	        if(ar.get(i)==ar.get(i+1)){
	            count++;
	            i+=2;
	        }else{
	            i++;
	        }
	    }
	    return count;
	}
}

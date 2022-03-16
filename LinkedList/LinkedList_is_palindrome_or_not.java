package LinkedList;
import java.util.*;
public class LinkedList_is_palindrome_or_not {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(15);
		list.add(30);
		list.add(-13);
		list.add(44);
		list.add(44);
		list.add(-13);
		list.add(30);
		list.add(15);
		
		
		List<Integer> rev_list = new LinkedList<Integer>();
		
		for(int i=list.size()-1;i>=0;i--) {
			rev_list.add(list.get(i));
		}
		
		boolean isPalindrome = true;
		int i =0;
		while(i<list.size()) {
			if(list.get(i)!=rev_list.get(i)) {
				isPalindrome = false;
				break;
			}
			i++;
		}
		
		if(isPalindrome == false) {
			System.out.println("False");
		}else {
			System.out.println("True");
		}
			
	}

}

package LinkedList;

import java.util.*;

public class Swapping_in_linkedList {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(15);
		list.add(30);
		list.add(-13);
		list.add(44);
		list.add(4);
		list.add(-13);
		list.add(30);
		list.add(1);
		
		System.out.println("Beforing Swapping: "+list);
		
		int ele1 = 15;
		int ele2 = 44;
		
		int index1 = list.indexOf(ele1);
		int index2 = list.indexOf(ele2);
		
		list.set(index1, ele2);
		list.set(index2, ele1);
		
		System.out.println("After Swapping: "+list);
		
		

	}

}

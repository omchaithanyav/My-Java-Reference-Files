package DoublyEndedQueue;

import java.util.ArrayDeque;

public class ArrayDoublyEndedQueue {

	public static void main(String[] args) {
	
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		//ad.removeLast(); //this line throws exception
		ad.pollFirst(); //this line does't throw exception
		
		
		ad.addLast(534);
		ad.addFirst(78);
		System.out.println(ad);
		ad.addLast(339);
		ad.push(12);
		ad.addFirst(-93);
		
		System.out.println(ad);
		
		ad.removeFirst();
		ad.removeLast();
		
		System.out.println(ad.pop());
		
		System.out.println(ad);
		
		System.out.println(ad.getLast());
		
		System.out.println(ad.getFirst());
		
		
		

	}

}

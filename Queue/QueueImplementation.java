package Queue;

import java.util.*;

public class QueueImplementation {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		
		//q.remove(); //remove - (but throws exception when queue is empty)
		
		q.add(9);  //add
		q.add(12);
		q.add(-19*2);
		
		System.out.println(q); 
		
		System.out.println(q.poll()); //remove without throwing an exception.
		System.out.println(q.remove());
		
		q.add(92);
		System.out.println(q);
		
		System.out.println(q.element()); //peek
		System.out.println(q.peek());
		
		// Iterate through a queue in Java
		System.out.println();
		for(int i: q) {
			System.out.println(i);
		};

	}

}

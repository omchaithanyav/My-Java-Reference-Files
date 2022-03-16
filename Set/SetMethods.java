package Set;

import java.util.*;
public class SetMethods {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(8);
		set1.add(13);
		set1.add(96);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(0);
		set2.add(13);
		set2.add(32);
		
		//set1.addAll(set2);  // Union
		//System.out.println(set1);
		
		//set2.retainAll(set1);  // Intersection
		//System.out.println(set2);
		
		System.out.println(set1.containsAll(set2));

	}

}

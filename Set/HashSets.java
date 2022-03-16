package Set;

import java.util.*;

public class HashSets {

	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<>();
		
		fruits.add("Orange");
		System.out.println(fruits.add("Kivi")); 
		fruits.add("Apple");
		fruits.add("SARA");
		System.out.println(fruits.add("Apple"));  // it returns false because Apple is already present inside the set and a set don't allow duplicate values.
		
		System.out.println(fruits);
		
		System.out.println(fruits.remove("Apple"));    
		
		System.out.println(fruits);
		
	}

}

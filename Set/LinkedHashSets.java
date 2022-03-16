package Set;

import java.util.*;
public class LinkedHashSets {

	public static void main(String[] args) {

		Set<String> fruits = new LinkedHashSet<>();
		
		fruits.add("Kivi");
		fruits.add("Apple");
		fruits.add("Banana");
		
		System.out.println(fruits.add("Banana"));
		
		System.out.println(fruits);
		
		System.out.println(fruits.remove("Apple")); 

	}

}

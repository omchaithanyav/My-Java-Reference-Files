package Set;

import java.util.*;
public class TreeSets {

	public static void main(String[] args) {
		
		Set<String> fruits = new TreeSet<>();
		
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Kivi");
		
		System.out.println(fruits.add("Banana"));
		
		System.out.println(fruits);
		
		System.out.println(fruits.remove("Apple")); 

	}

}

package Map_Interface;

import java.util.*;
import java.util.Map.Entry;
public class HashMaps {

	public static void main(String[] args) {
		
		Map<String, Integer> numbers = new HashMap<>();
		
		numbers.put("one", 1);
		numbers.put("eight",8);
		numbers.put("five", 5);
		numbers.put("two", 2);
		
		System.out.println(numbers);
		
		numbers.put("one", 8);
		System.out.println(numbers);
		
		System.out.println(numbers.get("five"));
		
		System.out.println(numbers.containsKey("eight"));
		System.out.println(numbers.containsKey("ten"));
		
		System.out.println(numbers.containsValue(5));
		System.out.println(numbers.containsValue(1));

		numbers.remove("five", 2);
		System.out.println(numbers);
		
		numbers.remove("five");
		System.out.println(numbers);
		
		numbers.replace("one", 8, 11);
		System.out.println(numbers);
		
		Map<String, Integer> numbers1 = new HashMap<>();
		
		numbers1.putAll(numbers);
		System.out.println(numbers1);
		
		numbers1.putIfAbsent("one", 111);
		System.out.println(numbers1);
		
		System.out.println(numbers.keySet());
		System.out.println(numbers.values());
		System.out.println(numbers.entrySet());
		
		
		for(Entry<String, Integer> entry: numbers.entrySet()) {
			entry.setValue(entry.getValue() * 100);
		}
		System.out.println(numbers);
	}

}

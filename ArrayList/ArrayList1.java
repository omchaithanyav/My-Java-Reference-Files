package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		
		List<String> fruits = new LinkedList<>();
		
		fruits.add("Banana"); // add()  - function
		fruits.add("Apple");
		fruits.add("hlo");
		
		System.out.println(fruits);
		System.out.println(fruits.get(1));
		
		ArrayList<String> vegetables = new ArrayList<>();
		
		vegetables.add("onion");
		vegetables.add("potato");
		
		System.out.println(vegetables);
		
		fruits.addAll(vegetables); // addAll() function adds one list to another.
		
		System.out.println(fruits);
		
		System.out.println(fruits.get(1)); // get(index) - function	
		
		vegetables.set(0, "Tomato"); // set(index, element) function is used to replace elements. 
		System.out.println(vegetables);
		
		fruits.remove(2);    // remove(index) function removes a specified element.
		System.out.println(fruits);
		
		List<String> toRemove = new ArrayList<>();
		
		toRemove.add("Apple");
		toRemove.add("swiggy");
		
		fruits.removeAll(toRemove); // removeAll() function
		System.out.println(fruits);
		
		System.out.println(fruits.contains("onion")); // contains(element) function
		
		System.out.println(fruits.isEmpty()); // isEmpty() function
		
		String temp[] = new String[fruits.size()]; // size() function returns the length of the list
		
		fruits.toArray(temp);
	
		for(String e: temp) {
			System.out.println(e);
		}
		
		fruits.clear();      // clear() function
		System.out.println(fruits);
 	}

}

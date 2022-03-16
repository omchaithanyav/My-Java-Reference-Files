package Strings;

public class StringsFunctions2 {

	public static void main(String[] args) {
		
		String name1 = "Om";
		String name2 = "CHAITHANYA";
		String name3 = "Om";
		String name4 = new String("Om");
		String name5 = "";
		String str = "a, b, c, d, e, f, g, h";
		String name6 = "     Ape      ";
		
		System.out.println(name1.equals(name4));
		System.out.println(name1.equals(name2));
		
		System.out.println(name1.isEmpty());
		System.out.println(name5.isEmpty());
		
		System.out.println(name1.concat(" " + name2));
		
		System.out.println(name4.replace('O', 'n'));
		
		String arr[] = str.split(",");
		for(String letters: arr) {
			
			System.out.println(letters);
		}
		
		System.out.println(name2.indexOf("T"));
		
		System.out.println(name2.toLowerCase());
		
		System.out.println(name1.toUpperCase());
		
		System.out.println(name6.trim());
		
		for(char ch: name2.toCharArray()) {
			System.out.print(ch+" ");
		}
		
		int i = name2.compareTo(name1);
		System.out.println();
		System.out.println(i);
		
		String abc = "hey bro";
		System.out.println(abc.replaceAll("[hbo]",""));
		
	}

}

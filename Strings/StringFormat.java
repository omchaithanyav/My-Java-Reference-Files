package Strings;

public class StringFormat {

	public static void main(String[] args) {
		String a = "Duffer";
		
		String b = String.format("My BABYDOLL is a %s", a);
		
		String c = String.format("float is %.10f", 12.1);
		String d = String.format("float is %25.10f", 12.1);
		
		String e = String.format("integer %10d", 1212);
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}

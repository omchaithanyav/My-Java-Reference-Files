package Oops.Polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		Pet p = d;
		
		Animal a = d;
		
		d.walk();
		p.walk();
		
		System.out.println();
		
		System.out.println(d.name);
		System.out.println(p.name);
		
		System.out.println();
		
		BeUnq();
		
		BeUnq("SARA");
		
		BeUnq("U", 4);
		

	}
	
	public static void BeUnq(String s) {
		
		System.out.println(s + " Always Be Unique");
	}
	
	public static void BeUnq() {
		
		System.out.println("Non");
		}
	
	public static void BeUnq(String s, int count) {
		for(int i = 1; i <= count; i++) {
			System.out.println(i + ". " + s + " r UNIQUE");
		}
	}
}


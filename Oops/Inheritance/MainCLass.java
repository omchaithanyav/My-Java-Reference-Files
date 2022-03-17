package Oops.Inheritance;

public class MainCLass {

	public static void main(String[] args) {
		
		Teacher t = new Teacher("SARA");
		
		t.eat();
		
		t.walk();
		
		t.teach();
		
		System.out.println();
		
		Singer s = new Singer("BABYDOLL");
		
		s.eat();
		
		s.walk();
		
		s.sing();
		
		System.out.println();
		
		//Upcasting and Downcasting:
		
		Teacher t1 = new Teacher("BABY");
		
		Singer s1 = new Singer("DOLL");
		
		Person p = t1;
		
		Teacher t2 = (Teacher) p;
		
		System.out.println(t1 instanceof Teacher);
		System.out.println(s1 instanceof Singer);
		System.out.println(t1 instanceof Person);
		System.out.println(t2 instanceof Person);
		System.out.println(p instanceof Singer);
		System.out.println(p instanceof Teacher);
		
		
		
		
		
		
		
		
		

	}

}

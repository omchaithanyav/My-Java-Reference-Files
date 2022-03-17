package Oops;

class Human{ // class
	
 	boolean younge;
	int eyes;
	int legs;
	String name;
	int age;
	
	public void run() {      // method
		System.out.println(name + " is running");
	}
	
	public void sleep() {    // method
		System.out.println(name + " is sleeping and his/her age is " + age);
	}
}


public class ClassesAndObjects {

	public static void main(String[] args) {
		
		Human human1 = new Human();   // object
		Human human2 = new Human();   // object
		 
		human1.name = "Omi";
		human1.age = 21;
		
		human2.name = "Sara";
		human2.age = 17;
		
		human1.run();
		System.out.println();
		
		human2.run();
		System.out.println();
		
		human1.sleep();
		System.out.println();
		
		human2.sleep();

	}

}

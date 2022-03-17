package Oops.Inheritance;

public class Singer extends Person {
	
	public Singer(String name) {
		
		super(name);
	}

	public void sing() {
		super.eat();
		System.out.println("singer " + name + " is singing");
	}
	
	public void eat() {
		System.out.println("singer " + name + " is eating");
	
	}

}

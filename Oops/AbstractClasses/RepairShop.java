package Oops.AbstractClasses;

public class RepairShop {

	public static void repairCar(Car car) {
		
		System.out.println("car is repaired");

	}
	
	public static void main(String[] args) {
		
		Ferrari f = new Ferrari();
		Lamborgini l = new Lamborgini();
		
		l.accelerate();
		f.breaking();
		
		repairCar(f);
		repairCar(l);
	}

}

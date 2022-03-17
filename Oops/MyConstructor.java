 package Oops;


class Saiyan {
	
	int power;
	String color;
	
	Saiyan(){
		
	}
	
	Saiyan(int power, int age){
		this.power = power;
		
	}
	
	Saiyan(int power, String color){
		this.power = power;
		this.color = color;
		
	}
}


public class MyConstructor {

	public static void main(String[] args) {
		
		Saiyan goku = new Saiyan();
		Saiyan vegeta = new Saiyan(99999, "Blue");
		Saiyan trunks = new Saiyan(9889, 99);
		
		
		System.out.println("Vegeta has a power of " + vegeta.power + " and his ki color is " + vegeta.color);
		System.out.println("Goku has a power of " + goku.power + " and his ki color is " + goku.color);
		System.out.println("Trunks has a power of " + trunks.power + " and his ki color is " + trunks.color);

	}

}

package Oops.Generics;

public class Pair<X, Y> {
	
	X x;
	Y y;
	
	public Pair(X x, Y y) {
		
		this.x = x;
		this.y = y;
	}
	
	public void getDescription(){
		
		System.out.println(x + " and " + y);
	}
	
	public static void main(String[] args) {
		
		Pair<String, Integer> p1 = new Pair("omi", 121.77);
		Pair<Boolean, String> p2 = new Pair(false, "hate");
		
		p1.getDescription();
		p2.getDescription();
	}

}

package Oops;

public class Methods {

	public static void main(String[] args) {
		
		float c = 32.43f;
		float d = 44.3f;

		int result = maxOf(c,d);
		System.out.println("largest of " + c + " and " + d  + " is " + result);
		System.out.println();
		
		int j = 21;
		int k = 12;
		
		swapOf(j,k);
		

	}
	
	static int maxOf(int a, int b) {
		
		return a>b? a:b;
	}
	
	static void sayHi() {
		
		System.out.println("Hii SARA");
	}
	
	static int maxOf(float a, float b) {
		
		return a>b? (int)a: (int)b;
	}
	
	static void swapOf(int x, int y) {
		
		System.out.println("before swaping: x = " + x + " y = " + y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("after swaping: x = " + x + " y = " + y);
	}
	
	
}



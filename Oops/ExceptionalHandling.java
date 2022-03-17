package Oops;

public class ExceptionalHandling {

	public static void main(String[] args) {

		func1();

	}
	
	static void func1() {
		
		int a = 10;
		int b = 7;
		
		int c = a/b;
		
		System.out.println(c);
		
		try {
			Thread.sleep(1500);
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println("after delay");
		
		func2();
	}
	
	
		static void func2() throws ArrayIndexOutOfBoundsException {
	    boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger is coming");
		}
	}
}
 
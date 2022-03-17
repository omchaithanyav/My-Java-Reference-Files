package Oops;

public class TryCatchFinal {

	public static void main(String[] args) {
		
		try {
		int a[] = new int[8];
		
		System.out.println(a[3]/0);

	}catch(ArithmeticException e) { 
		System.out.println(e.getMessage() + " occured");
		
	}catch(ArrayIndexOutOfBoundsException e ) {
		System.out.println(e.getMessage() + ", correct your code please");
		
	}catch(IllegalArgumentException e) {
		System.out.println("check your casting carefully");
	
	}catch(Exception e) {
		System.out.println("an error occured");
	
	}finally {
		System.out.println("Sorry for the inconvenience");
	}
		
		System.out.println("very important code");
		System.out.println("need to run");

}
}  